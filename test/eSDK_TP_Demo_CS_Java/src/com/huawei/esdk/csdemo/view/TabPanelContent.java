package com.huawei.esdk.csdemo.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JPanel;
import com.huawei.esdk.csdemo.common.InterfaceNameConstant;
import com.huawei.esdk.csdemo.view.tabs.EditConf;
import com.huawei.esdk.csdemo.view.tabs.MyTabPane;
import com.huawei.esdk.csdemo.view.tabs.QuerySite;
import com.huawei.esdk.csdemo.view.tabs.ScheduleConf;

public class TabPanelContent extends JPanel
{
    
    /**
     * 序列号
     */
    private static final long serialVersionUID = -8045395902158394465L;
    
    //存放所有接口对应的界面
    private Map<String, MyTabPane> tabs = new HashMap<String, MyTabPane>();
    
    public void init()
    {   
        ScheduleConf scheduleConf = new ScheduleConf();
        scheduleConf.initComponents();
        scheduleConf.setVisible(false);
        this.add(scheduleConf);
        tabs.put(InterfaceNameConstant.scheduleConf, scheduleConf);
        
        EditConf editConf = new EditConf();
        editConf.initComponents();
        editConf.setVisible(false);
        this.add(editConf);
        tabs.put(InterfaceNameConstant.editConf, editConf);
        
        QuerySite querySite = new QuerySite();
        querySite.initComponents();
        querySite.setVisible(false);
        this.add(querySite);
        tabs.put(InterfaceNameConstant.querySite, querySite);
        
    }
    
    public void showTabByName(String name)
    {
        
        if (!tabs.containsKey(name))
        {
            return;
        }
        
        for (Entry<String, MyTabPane> entry : tabs.entrySet())
        {
            if (entry.getKey().equals(name))
            {
                if (!entry.getValue().isVisible())
                {
                    entry.getValue().setVisible(true);
                }
            }
            else
            {
                if (entry.getValue().isVisible())
                {
                    entry.getValue().setVisible(false);
                }
            }
        }
    }
    
    public Map<String, MyTabPane> getTabs()
    {
        return tabs;
    }
    
    public void setTabs(Map<String, MyTabPane> tabs)
    {
        this.tabs = tabs;
    }
    
}
