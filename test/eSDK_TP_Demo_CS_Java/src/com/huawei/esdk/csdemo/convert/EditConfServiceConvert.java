package com.huawei.esdk.csdemo.convert;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import com.google.gson.Gson;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.soap.impl.autogen.EditScheduledConfExResponse;
import com.huawei.esdk.csdemo.soap.impl.utils.DateUtils;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.EditConf;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;


public class EditConfServiceConvert
{
    
    private static EditConf editConfTab = (EditConf)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.editConf);
    
    @SuppressWarnings("rawtypes")
    public static void getParametersFromConferenceInfoFrame(com.huawei.esdk.csdemo.soap.impl.autogen.ConferenceInfoEx conferenceInfo) throws DemoException
    {
        conferenceInfo.setConfId(editConfTab.getInputText0().getText());
        conferenceInfo.setName(editConfTab.getInputText1().getText());
        
        conferenceInfo.setBeginTime(DateUtils.toGregorianCalendarDate(
            parseDate(editConfTab.getInputText2().getText(), "confBeginTime")));
        
        conferenceInfo.setDuration(parseDuration(editConfTab.getInputText3().getText(), "confDuration"));
        conferenceInfo.setAccessCode(editConfTab.getInputText4().getText());
        conferenceInfo.setAuxVideoFormat(parseInt(editConfTab.getInputText5().getText(),"auxVideoFormat"));
        conferenceInfo.setAuxVideoProtocol(parseInt(editConfTab.getInputText6().getText(),"auxVideoProtocol"));
        conferenceInfo.setCpResouce(parseInt(editConfTab.getInputText7().getText(),"cpResouce"));
        conferenceInfo.setRate(editConfTab.getInputText8().getText());
        conferenceInfo.setPassword(editConfTab.getInputText9().getText());
        conferenceInfo.setIsRecording(parseInt(editConfTab.getInputText10().getText(),"isRecording"));
        conferenceInfo.setChairmanPassword(editConfTab.getInputText11().getText());
        conferenceInfo.setMediaEncryptType(parseInt(editConfTab.getInputText12().getText(),"mediaEncryptType"));
        conferenceInfo.setIsLiveBroadcast(parseInt(editConfTab.getInputText13().getText(),"isLiveBroadcast"));
        conferenceInfo.setPresentation(parseInt(editConfTab.getInputText14().getText(),"presentation"));
        conferenceInfo.setBillCode(editConfTab.getInputText15().getText());
        conferenceInfo.setMainSiteUri(editConfTab.getInputText16().getText());
        
        com.huawei.esdk.csdemo.soap.impl.autogen.ConferenceNoticeEx confNotice = 
            new com.huawei.esdk.csdemo.soap.impl.autogen.ConferenceNoticeEx();
        confNotice.setEmail(editConfTab.getInputText17().getText());
        confNotice.setContent(editConfTab.getInputText18().getText());
        conferenceInfo.setConferenceNotice(confNotice);

        //设置会场参数     
        Vector data = editConfTab.getTableMode1().getDataVector();
        
        for (int i = 0; i < data.size(); i++)
        {
            
            Vector item = (Vector)data.get(i);
            com.huawei.esdk.csdemo.soap.impl.autogen.SiteInfoEx confSite =
                new com.huawei.esdk.csdemo.soap.impl.autogen.SiteInfoEx();
            
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
            conferenceInfo.getSites().add(confSite);
        }
        
    }
    
    public static void showConvertErrInfo(String errInfo)
    {
        editConfTab.getOutputText1().setText("");
        editConfTab.getOutputText2().setText("");
        editConfTab.showOperationStatus(null);
        JOptionPane.showMessageDialog(null, errInfo, "ERROR", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showResultInFrame(EditScheduledConfExResponse result)
    {
        int resultCode = result.getResultCode();
        editConfTab.getOutputText1().setText(String.valueOf(result.getResultCode()));
        
        if(0 != resultCode)
        {
            editConfTab.getStatusPanel().setForeground(Color.red);
            editConfTab.showOperationStatus(false);
            editConfTab.getOutputText2().setText("");
            return;
        }
        
        editConfTab.getStatusPanel().setForeground(Color.blue);
        editConfTab.showOperationStatus(true);
        
        editConfTab.getOutputText2().setText(new Gson().toJson(result));
   
    }
    
    public static void showloginErrCode(int loginErrorCode)
    {
        editConfTab.getOutputText1().setText(String.valueOf(loginErrorCode));
        editConfTab.getOutputText2().setText("");
        editConfTab.getStatusPanel().setForeground(Color.red);
        editConfTab.showOperationStatus(false);
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
