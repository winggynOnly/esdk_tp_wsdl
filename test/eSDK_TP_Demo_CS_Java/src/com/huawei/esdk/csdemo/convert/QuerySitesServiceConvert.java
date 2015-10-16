package com.huawei.esdk.csdemo.convert;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.DemoApp;
import com.huawei.esdk.csdemo.view.tabs.QuerySite;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;
import com.huawei.esdk.tp.professional.local.bean.FilterBaseEx;
import com.huawei.esdk.tp.professional.local.bean.PageParamEx;
import com.huawei.esdk.tp.professional.local.bean.QueryConfigEx;
import com.huawei.esdk.tp.professional.local.bean.SortItemEx;
import com.huawei.esdk.tp.professional.local.bean.StringFilterEx;
import com.huawei.esdk.tp.professional.local.bean.TPSDKResponseWithPageEx;
import com.huawei.esdk.tp.professional.local.bean.TerminalInfoEx;

public class QuerySitesServiceConvert
{
    
    private static QuerySite querySiteTab = (QuerySite)DemoApp.tabContent.getTabs()
        .get(InterfaceNameConstant.querySite);
    
    @SuppressWarnings("rawtypes")
    public static void getParametersFromFrame(QueryConfigEx queryConfig) throws DemoException
    { 
        PageParamEx pageParamEx = new PageParamEx();
        pageParamEx.setCurrentPage(parseInt(querySiteTab.getInputText2().getText(),"currentPage"));
        pageParamEx.setNumberPerPage(parseInt(querySiteTab.getInputText1().getText(),"numberPerPage"));
        queryConfig.setPageParam(pageParamEx);

        //设置排序
        List<SortItemEx> sortItems = new ArrayList<SortItemEx>(); 
        queryConfig.setSortItems(sortItems);    
        Vector data = querySiteTab.getTableMode1().getDataVector();
        for (int i = 0; i < data.size(); i++)
        {
            Vector item = (Vector)data.get(i);
            SortItemEx sortItem = new SortItemEx();
            
            for (int j = 0; j < item.size(); j++)
            {      
                if (0 == j)
                {
                    sortItem.setSort(parseInt(getString(item.get(j)), "sort.sort"));
                }
                else if (1 == j)
                {
                    sortItem.setItemIndex(parseInt(getString(item.get(j)), "sort.itemIndex"));
                }  
            }
            sortItems.add(sortItem);
        }
        
        //设置过滤
        List<FilterBaseEx> filterItems = new ArrayList<FilterBaseEx>(); 
        queryConfig.setFilters(filterItems);    
        Vector data1 = querySiteTab.getTableMode2().getDataVector();
        for (int i = 0; i < data1.size(); i++)
        {
            Vector item = (Vector)data1.get(i);
            StringFilterEx filterItem = new StringFilterEx();
            
            for (int j = 0; j < item.size(); j++)
            {      
                if (0 == j)
                {
                    filterItem.setColumnIndex(parseInt(getString(item.get(j)), "filter.columnIndex"));
                }
                else if (1 == j)
                {
                    filterItem.setValue(getString(item.get(j)));
                }  
            }
            filterItems.add(filterItem);
        }
        
    }
    
    public static void showConvertErrInfo(String errInfo)
    {
        querySiteTab.getOutputText1().setText("");
        querySiteTab.getOutputText2().setText("");
        querySiteTab.showOperationStatus(null);
        JOptionPane.showMessageDialog(null, errInfo, "ERROR", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showResultInFrame(TPSDKResponseWithPageEx<List<TerminalInfoEx>> result)
    {
        int resultCode = result.getResultCode();
        querySiteTab.getOutputText1().setText(String.valueOf(result.getResultCode()));
        
        if(0 != resultCode)
        {
            querySiteTab.getStatusPanel().setForeground(Color.red);
            querySiteTab.showOperationStatus(false);
            querySiteTab.getOutputText2().setText("");
            return;
        }
        
        querySiteTab.getStatusPanel().setForeground(Color.blue);
        querySiteTab.showOperationStatus(true);
        
        querySiteTab.getOutputText2().setText(new Gson().toJson(result));
   
    }
    
    public static void showloginErrCode(int loginErrorCode)
    {
        querySiteTab.getOutputText1().setText(String.valueOf(loginErrorCode));
        querySiteTab.getOutputText2().setText("");
        querySiteTab.getStatusPanel().setForeground(Color.red);
        querySiteTab.showOperationStatus(false);
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
 
    private static String getString(Object val)
    {
        if(null == val)
        {
            return null;
        }
        return  String.valueOf(val);
    }
}
