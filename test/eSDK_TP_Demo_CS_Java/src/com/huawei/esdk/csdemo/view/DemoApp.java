package com.huawei.esdk.csdemo.view;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.huawei.esdk.csdemo.action.impl.EditScheduleConfBtnActionImpl;
import com.huawei.esdk.csdemo.action.impl.QuerySitesBtnActionImpl;
import com.huawei.esdk.csdemo.action.impl.ScheduleConfBtnActionImpl;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.common.ServiceFactory;

public class DemoApp
{
    public static MainFrame mainFrame;
    
    public static TabPanelContent tabContent;
    
    public static LoadingFrame loadingFrame = new LoadingFrame();
    
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                loadingFrame = new LoadingFrame();
                loadingFrame.setVisible(true);
                loadingFrame.setLocationRelativeTo(null);
                loadingFrame.showProgressMessage("加载Native模块,请稍候...");
            }
        });
        ServiceFactory.getInstance();
        
        try
        {
            System.setProperty("org.apache.cxf.JDKBugHacks.defaultUsesCaches", "true");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
        loadingFrame.showProgressMessage("初始化Demo组件,请稍候...");
        lunchFrame();
        
    }
    
    public static void lunchFrame()
    {
        tabContent = new TabPanelContent();
        tabContent.init();
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                mainFrame = new MainFrame(tabContent);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
                loadingFrame.finish();
            }
        });
        
        //向各个接口对应的面板中加入执行native方法的事件，start
        ScheduleConfBtnActionImpl scheduleConfBtnAction = new ScheduleConfBtnActionImpl();
        tabContent.getTabs().get(InterfaceNameConstant.scheduleConf).setAction(scheduleConfBtnAction);
        
        EditScheduleConfBtnActionImpl editConfBtnAction = new EditScheduleConfBtnActionImpl();
        tabContent.getTabs().get(InterfaceNameConstant.editConf).setAction(editConfBtnAction);
        
        QuerySitesBtnActionImpl querySiteBtnAction = new QuerySitesBtnActionImpl();
        tabContent.getTabs().get(InterfaceNameConstant.querySite).setAction(querySiteBtnAction);
        //end
        
    }
    
}
