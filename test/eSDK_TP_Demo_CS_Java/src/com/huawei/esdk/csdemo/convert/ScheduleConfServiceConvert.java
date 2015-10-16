package com.huawei.esdk.csdemo.convert;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import com.google.gson.Gson;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.ScheduleConf;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;
import com.huawei.esdk.tp.professional.local.bean.ConferenceInfoEx;
import com.huawei.esdk.tp.professional.local.bean.ConferenceNoticeEx;
import com.huawei.esdk.tp.professional.local.bean.SiteInfoEx;
import com.huawei.esdk.tp.professional.local.bean.TPSDKResponseEx;


public class ScheduleConfServiceConvert
{
    
    private static ScheduleConf createConfTab = (ScheduleConf)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.scheduleConf);
    
    @SuppressWarnings("rawtypes")
    public static void getParametersFromConferenceInfoFrame(ConferenceInfoEx conferenceInfo) throws DemoException
    {
        conferenceInfo.setName(createConfTab.getInputText1().getText());
        conferenceInfo.setBeginTime(parseDate(createConfTab.getInputText2().getText(), "confBeginTime"));
        conferenceInfo.setDuration(parseDuration(createConfTab.getInputText3().getText(), "confDuration"));
        conferenceInfo.setAccessCode(createConfTab.getInputText4().getText());
        conferenceInfo.setAuxVideoFormat(parseInt(createConfTab.getInputText5().getText(),"auxVideoFormat"));
        conferenceInfo.setAuxVideoProtocol(parseInt(createConfTab.getInputText6().getText(),"auxVideoProtocol"));
        conferenceInfo.setCpResouce(parseInt(createConfTab.getInputText7().getText(),"cpResouce"));
        conferenceInfo.setRate(createConfTab.getInputText8().getText());
        conferenceInfo.setPassword(createConfTab.getInputText9().getText());
        conferenceInfo.setIsRecording(parseInt(createConfTab.getInputText10().getText(),"isRecording"));
        conferenceInfo.setChairmanPassword(createConfTab.getInputText11().getText());
        conferenceInfo.setMediaEncryptType(parseInt(createConfTab.getInputText12().getText(),"mediaEncryptType"));
        conferenceInfo.setIsLiveBroadcast(parseInt(createConfTab.getInputText13().getText(),"isLiveBroadcast"));
        conferenceInfo.setPresentation(parseInt(createConfTab.getInputText14().getText(),"presentation"));
        conferenceInfo.setBillCode(createConfTab.getInputText15().getText());
        conferenceInfo.setMainSiteUri(createConfTab.getInputText16().getText());
        
        ConferenceNoticeEx confNotice = new ConferenceNoticeEx();
        confNotice.setEmail(createConfTab.getInputText17().getText());
        confNotice.setContent(createConfTab.getInputText18().getText());
        conferenceInfo.setConferenceNotice(confNotice);

        //设置会场参数
        List<SiteInfoEx> confSites = new ArrayList<SiteInfoEx>(); 
        conferenceInfo.setSites(confSites);
            
        Vector data = createConfTab.getTableMode1().getDataVector();
        
        for (int i = 0; i < data.size(); i++)
        {
            
            Vector item = (Vector)data.get(i);
            SiteInfoEx confSite = new SiteInfoEx();
            
            for (int j = 0; j < item.size(); j++)
            {
                if (0 == j)
                {
                    confSite.setUri(getString(item.get(j)));
                }
                else if (1 == j)
                {
                    confSite.setName(getString(item.get(j)));
                }
                else if (2 == j)
                {
                    confSite.setType(parseInt(getString(item.get(j)), "confSite.type"));
                }
                else if (3 == j)
                {
                    confSite.setFrom(parseInt(getString(item.get(j)), "confSite.from"));
                }
                else if (4 == j)
                {
                    confSite.setDialingMode(parseInt(getString(item.get(j)), "confSite.dialingMode"));
                }
                else if (5 == j)
                {
                    confSite.setRate(getString(item.get(j)));
                }
                else if (6 == j)
                {
                    confSite.setVideoFormat(parseInt(getString(item.get(j)), "confSite.videoFormat"));
                }
                else if (7 == j)
                {
                    confSite.setVideoProtocol(parseInt(getString(item.get(j)), "confSite.videoProtocol"));
                }
                else if (8 == j)
                {
                    confSite.setIsLockVideoSource(parseInt(getString(item.get(j)), "confSite.isLockVideoSource"));
                }
                else if (9 == j)
                {
                    confSite.setParticipantType(parseInt(getString(item.get(j)), "confSite.participantType"));
                }
                
            }
            confSites.add(confSite);
        }
        
    }
    
    public static void showConvertErrInfo(String errInfo)
    {
        createConfTab.getOutputText1().setText("");
        createConfTab.getOutputText2().setText("");
        createConfTab.showOperationStatus(null);
        JOptionPane.showMessageDialog(null, errInfo, "ERROR", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showResultInFrame(TPSDKResponseEx<ConferenceInfoEx> result)
    {
        int resultCode = result.getResultCode();
        createConfTab.getOutputText1().setText(String.valueOf(result.getResultCode()));
        
        if(0 != resultCode)
        {
            createConfTab.getStatusPanel().setForeground(Color.red);
            createConfTab.showOperationStatus(false);
            createConfTab.getOutputText2().setText("");
            return;
        }
        
        createConfTab.getStatusPanel().setForeground(Color.blue);
        createConfTab.showOperationStatus(true);
        
        createConfTab.getOutputText2().setText(new Gson().toJson(result));
   
    }
    
    public static void showloginErrCode(int loginErrorCode)
    {
        createConfTab.getOutputText1().setText(String.valueOf(loginErrorCode));
        createConfTab.getOutputText2().setText("");
        createConfTab.getStatusPanel().setForeground(Color.red);
        createConfTab.showOperationStatus(false);
    }
    
    private static Integer parseInt(String val, String labelName) throws DemoException
    {
        if(null == val || val.isEmpty())
        {
            return null;
        }
        try
        {
            return Integer.parseInt(val);
        }
        catch(NumberFormatException e)
        {
            String errInfo = InternationalUtils.getValue(labelName) +
                InternationalUtils.getValue("paramTypeError");
            DemoException demoEx = new DemoException(errInfo);
            throw demoEx;
        }
    }
    
    private static Date parseDate(String val, String labelName) throws DemoException
    {
        if(null == val || val.isEmpty())
        {
            return null;
        }
        SimpleDateFormat format =  new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        try
        {
            return format.parse(val);
        }
        catch (ParseException e)
        {
            String errInfo = InternationalUtils.getValue(labelName) +
                InternationalUtils.getValue("paramTypeError");
            DemoException demoEx = new DemoException(errInfo);
            throw demoEx;
        }
    }
    
    private static Duration parseDuration(String val, String labelName) throws DemoException
    {
        if(null == val || val.isEmpty())
        {
            return null;
        }
        try
        {
            return DatatypeFactory.newInstance().newDuration(1000 * 60 * parseInt(val, labelName));
        }
        catch (DatatypeConfigurationException e)
        {
            String errInfo = InternationalUtils.getValue(labelName) +
                InternationalUtils.getValue("paramTypeError");
            DemoException demoEx = new DemoException(errInfo);
            throw demoEx;
        }
    }
    
    private static String getString(Object val)
    {
        if(null == val)
        {
            return null;
        }
        return  String.valueOf(val);
    }
}
