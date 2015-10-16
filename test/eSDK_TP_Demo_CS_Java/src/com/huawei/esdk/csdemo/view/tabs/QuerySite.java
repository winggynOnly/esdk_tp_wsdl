package com.huawei.esdk.csdemo.view.tabs;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

import com.huawei.esdk.csdemo.common.PropertiesUtils;
import com.huawei.esdk.csdemo.convert.QuerySitesServiceConvert;
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;

public class QuerySite extends MyTabPane
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = 3296547845318987007L;

    private javax.swing.JLabel inputLabel1;
    private javax.swing.JTextField inputText1;

    private javax.swing.JLabel inputLabel2;
    private javax.swing.JTextField inputText2;
    
    private JPanel inputPanel3;
    
    private JTable jTable1;
    private DefaultTableModel tableMode1;
    private JScrollPane tableJscroll1;
    private JButton addSort;
    private JButton deleteSort;
    
    private JTable jTable2;
    private DefaultTableModel tableMode2;
    private JScrollPane tableJscroll2;
    private JButton addFilter;
    private JButton deleteFilter;
    //状态栏
    private Boolean isSuccess;
    private javax.swing.JLabel statusPanel;

    //输出
    //第一个输出
    private javax.swing.JLabel outputLabel1;
    private javax.swing.JTextField outputText1;
    //第二个输出
    private javax.swing.JLabel outputLabel2;
    private javax.swing.JTextField outputText2;

    //主面板
    private JScrollPane paneJscroll = new JScrollPane();
    private javax.swing.JPanel jPanel;
    private JPanel inputPanel;
    private JPanel outputPanel;

    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;

    //接口说明
    private ScrollPane descEditPaneJscroll = new ScrollPane();
    private JEditorPane descEditPane = new JEditorPane();
    private Font font = new Font("微软雅黑,宋体,Arial,sans-serif", Font.PLAIN, 14);
    
    //代码示例
    private ScrollPane codeEditPaneJscroll = new ScrollPane();
    private JEditorPane codeEditPane = new JEditorPane();

    public void initComponents(){
        jPanel = new javax.swing.JPanel();
        
        inputLabel1 = new javax.swing.JLabel();
        inputText1 = new javax.swing.JTextField();
        inputLabel2 = new javax.swing.JLabel();
        inputText2 = new javax.swing.JTextField();
 
        jTable1 = new javax.swing.JTable();
        tableMode1 = new DefaultTableModel();
        tableJscroll1 = new JScrollPane();
        addSort = new JButton();
        deleteSort = new JButton();
        
        jTable2 = new javax.swing.JTable();
        tableMode2 = new DefaultTableModel();
        tableJscroll2 = new JScrollPane();
        addFilter = new JButton();
        deleteFilter = new JButton();
        
        jTable1 = new javax.swing.JTable();
        tableMode1 = new DefaultTableModel();
        tableJscroll1 = new JScrollPane();
        addSort = new JButton();
        deleteSort = new JButton();
        
        jSeparator1 = new javax.swing.JSeparator();
        statusPanel = new javax.swing.JLabel();

        jSeparator2 = new javax.swing.JSeparator();

        outputLabel2 = new javax.swing.JLabel();
        outputText2 = new javax.swing.JTextField();
        outputLabel1 = new javax.swing.JLabel();
        outputText1 = new javax.swing.JTextField();
 
        descEditPane.setContentType("text/html;charset=utf-8");
        descEditPane.setEditable(false);
        descEditPane.setPreferredSize(new Dimension(getWidth(), 2250));
        descEditPaneJscroll.add(descEditPane);
        
        this.setPreferredSize(getSize());
        this.addTab("说明", descEditPaneJscroll);
    
        statusPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusPanel.setText("");
    
        //输入框
        inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createTitledBorder("输入"));
        
        
        //排序条件列表
        JPanel inputPanel1 = new JPanel();
        jTable1.setEnabled(true);
        tableJscroll1.setBorder(BorderFactory.createTitledBorder("成员列表"));
        tableJscroll1.add(jTable1);
        tableJscroll1.setViewportView(jTable1);
        //初始化查询条件列表
        jTable1.setModel(tableMode1);
        tableMode1.fireTableDataChanged();
        
        javax.swing.GroupLayout table1Layout = new javax.swing.GroupLayout(inputPanel1);
        inputPanel1.setLayout(table1Layout);
        table1Layout.setHorizontalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addComponent(tableJscroll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(10, 10, 20)
                .addComponent(addSort)
                .addGap(20, 20, 100)
                .addComponent(deleteSort)
                .addGap(20, 20, 100))
            );
        table1Layout.setVerticalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,true)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tableJscroll1, 100, 100, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSort)
                    .addComponent(deleteSort)))
        );
        
      //排序条件列表结束
        

    //过滤条件列表
    JPanel inputPanel2 = new JPanel();
    jTable2.setEnabled(true);
    tableJscroll2.setBorder(BorderFactory.createTitledBorder("成员列表"));
    tableJscroll2.add(jTable2);
    tableJscroll2.setViewportView(jTable2);
    //初始化查询条件列表
//        initConditionTableMode();
    jTable2.setModel(tableMode2);
    tableMode2.fireTableDataChanged();
    
    javax.swing.GroupLayout table1Layout2 = new javax.swing.GroupLayout(inputPanel2);
    inputPanel2.setLayout(table1Layout2);
    table1Layout2.setHorizontalGroup(
        table1Layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
        .addComponent(tableJscroll2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(table1Layout2.createSequentialGroup()
            .addGap(10, 10, 20)
            .addComponent(addFilter)
            .addGap(20, 20, 100)
            .addComponent(deleteFilter)
            .addGap(20, 20, 100))
        );
    table1Layout2.setVerticalGroup(
        table1Layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,true)
        .addGroup(table1Layout2.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(tableJscroll2, 100, 100, Short.MAX_VALUE)
            .addGap(10, 10, 10)
            .addGroup(table1Layout2.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addFilter)
                .addComponent(deleteFilter)))
    );
    //过滤条件列表结束
    
    
    inputPanel3 = new JPanel();
    inputPanel3.setBorder(BorderFactory.createTitledBorder("输入"));
    GroupLayout jPanel2Layout = new GroupLayout(inputPanel3);
    inputPanel3.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
                .addComponent(inputLabel1, 130, 130, Short.MAX_VALUE))
                .addGap(10, 10, 10)
            
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, true)
                .addComponent(inputText1, 100, 100, Short.MAX_VALUE))
                .addGap(20, 20, 50)
            
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
                .addComponent(inputLabel2, 130, 130, Short.MAX_VALUE))
                .addGap(10, 10, 10)
            
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, true)
                .addComponent(inputText2, 100, 100, Short.MAX_VALUE))
                .addContainerGap(10, 10))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(25, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(inputLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(inputText1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(inputLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(inputText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addContainerGap(20, Short.MAX_VALUE))
    );
        
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addComponent(inputPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionBtn, 120, 120, 120)
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addGroup(layout1.createSequentialGroup()
                .addComponent(inputPanel1, 150, 150, 150)
                .addComponent(inputPanel2, 150, 150, 150)
                .addComponent(inputPanel3, 80, 80, 80)
                .addGap(12, 12, 12)
                .addComponent(actionBtn, 25, 25, 25)
        ));
        
        //输出框
        outputPanel = new JPanel();
        outputPanel.setBorder(BorderFactory.createTitledBorder("输出"));
        GroupLayout jPanel3Layout = new GroupLayout(outputPanel);
        outputPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.CENTER,true)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(outputLabel1, 140, 140, Short.MAX_VALUE)
                    .addComponent(outputLabel2, 140, 140, Short.MAX_VALUE))
                .addGap(0,0,0)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(outputText1, 208, 208, Short.MAX_VALUE)
                    .addComponent(outputText2, 208, 208, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(statusPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputText1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPanel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    
          
        JPanel jPanel1 = new JPanel();
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER,true)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER, true)
                    .addComponent(outputPanel, 540, 540, Short.MAX_VALUE)
                    .addComponent(inputPanel, 540, 540, Short.MAX_VALUE))
                .addContainerGap(10, 10)
        ));
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING,true)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(inputPanel, 450, 450, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputPanel, 170, 170, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE)
        ));
        
        
        paneJscroll.add(jPanel1);
        paneJscroll.setBorder(BorderFactory.createEtchedBorder());
        paneJscroll.setViewportView(jPanel1);
        
        JPanel mainPanelContent = new JPanel();
        GroupLayout layout = new GroupLayout(mainPanelContent);
        mainPanelContent.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER,true)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneJscroll, 580, 580, Short.MAX_VALUE)
        ));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING,true)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneJscroll, 400, 400, Short.MAX_VALUE)
        ));


        this.addTab("执行", mainPanelContent);
    
        
        codeEditPane.setContentType("text/html;charset=utf-8");
        codeEditPane.setEditable(false);
        codeEditPaneJscroll.add(codeEditPane);
    
        this.addTab("源码", codeEditPaneJscroll);
        
        International(0);
        
        addSort.addMouseListener(new MouseAdapter()
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (1 > tableMode1.getRowCount())
                {
                    tableMode1.addRow(new String[] {"", ""});
                }
                else
                {
                    QuerySitesServiceConvert.showConvertErrInfo(InternationalUtils.getValue("sortErr"));
                }
                
            }
            
        });
        
        deleteSort.addMouseListener(new MouseAdapter()
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int selectRow = jTable1.getSelectionModel().getMaxSelectionIndex();
                
                if (-1 < selectRow)
                {
                    tableMode1.removeRow(selectRow);
                }
            }
            
        });
        
        addFilter.addMouseListener(new MouseAdapter()
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                
                tableMode2.addRow(new String[] {"", ""});
            }
            
        });
        
        deleteFilter.addMouseListener(new MouseAdapter()
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int selectRow = jTable2.getSelectionModel().getMaxSelectionIndex();
                
                if (-1 < selectRow)
                {
                    tableMode2.removeRow(selectRow);
                }
            }
            
        });
    }

    @Override
    public void International(int languageFlag){
        InternationalUtils.languageFlag = languageFlag;
        this.setTitleAt(0, InternationalUtils.getValue("instruction"));
        this.setTitleAt(1, InternationalUtils.getValue("execute"));
        this.setTitleAt(2, InternationalUtils.getValue("code"));

        inputPanel.setBorder(BorderFactory.createTitledBorder((InternationalUtils.getValue("input"))));
        outputPanel.setBorder(BorderFactory.createTitledBorder((InternationalUtils.getValue("output"))));
        tableJscroll1.setBorder(BorderFactory.createTitledBorder(InternationalUtils.getValue("sortCondition")));
        tableJscroll2.setBorder(BorderFactory.createTitledBorder(InternationalUtils.getValue("filterCondition")));
        inputPanel3.setBorder(BorderFactory.createTitledBorder(InternationalUtils.getValue("pageParam")));
        
            
        //国际化成员列表的标题栏
        Vector<String> titles = new Vector<String>();
        titles.add(InternationalUtils.getValue("sort.sort"));
        titles.add(InternationalUtils.getValue("sort.itemIndex"));
        Vector<Vector<String>> rows = new Vector<Vector<String>>();
        tableMode1.setDataVector(rows, titles);
        addSort.setText(InternationalUtils.getValue("addSort"));
        deleteSort.setText(InternationalUtils.getValue("deleteSort"));
        
        Vector<String> titles1 = new Vector<String>();
        titles1.add(InternationalUtils.getValue("filter.columnIndex"));
        titles1.add(InternationalUtils.getValue("filter.value"));
        Vector<Vector<String>> rows1 = new Vector<Vector<String>>();
        tableMode2.setDataVector(rows1, titles1);
        addFilter.setText(InternationalUtils.getValue("addFilter"));
        deleteFilter.setText(InternationalUtils.getValue("deleteFilter"));
        
        inputLabel1.setText(InternationalUtils.getValue("numberPerPage"));
        inputLabel2.setText(InternationalUtils.getValue("currentPage"));
        
        actionBtn.setText(InternationalUtils.getValue("querySites"));
        
        outputLabel1.setText(InternationalUtils.getValue("resultCode")+":");
        outputLabel2.setText(InternationalUtils.getValue("resultData")+":");
        
        showOperationStatus(isSuccess);
        
        if(0 == languageFlag){
            String htmlDesc = PropertiesUtils.getHtmlFromTxt("querySites_zh.txt");
            descEditPane.setText(htmlDesc);
            String codeDesc = PropertiesUtils.getHtmlFromTxt("querySites_code_zh.txt");
            codeEditPane.setText(codeDesc);
        }
        else if(1 == languageFlag)
        {
            String htmlDesc = PropertiesUtils.getHtmlFromTxt("querySites_en.txt");
            descEditPane.setText(htmlDesc);
            String codeDesc = PropertiesUtils.getHtmlFromTxt("querySites_code_en.txt");
            codeEditPane.setText(codeDesc);
        }
    }

    public void showOperationStatus(Boolean status){
        isSuccess = status;
        if(null != isSuccess){
            if(isSuccess)
            {
                statusPanel.setText(InternationalUtils.getValue("success"));
            }else{
                statusPanel.setText(InternationalUtils.getValue("fail"));
            }
        }else{
            statusPanel.setText("");
        }
    }

    
    
    public javax.swing.JLabel getStatusPanel()
    {
        return statusPanel;
    }
    
    public void setStatusPanel(javax.swing.JLabel statusPanel)
    {
        this.statusPanel = statusPanel;
    }
    
    public javax.swing.JLabel getOutputLabel1()
    {
        return outputLabel1;
    }
    
    public void setOutputLabel1(javax.swing.JLabel outputLabel1)
    {
        this.outputLabel1 = outputLabel1;
    }
    
    public javax.swing.JTextField getOutputText1()
    {
        return outputText1;
    }
    
    public void setOutputText1(javax.swing.JTextField outputText1)
    {
        this.outputText1 = outputText1;
    }
    
    public javax.swing.JLabel getOutputLabel2()
    {
        return outputLabel2;
    }
    
    public void setOutputLabel2(javax.swing.JLabel outputLabel2)
    {
        this.outputLabel2 = outputLabel2;
    }

    
    public javax.swing.JTextField getOutputText2()
    {
        return outputText2;
    }
    
    public void setOutputText2(javax.swing.JTextField outputText2)
    {
        this.outputText2 = outputText2;
    }
    
    public javax.swing.JPanel getjPanel()
    {
        return jPanel;
    }
    
    public void setjPanel(javax.swing.JPanel jPanel)
    {
        this.jPanel = jPanel;
    }
    
    public javax.swing.JSeparator getjSeparator1()
    {
        return jSeparator1;
    }
    
    public void setjSeparator1(javax.swing.JSeparator jSeparator1)
    {
        this.jSeparator1 = jSeparator1;
    }
    
    public javax.swing.JSeparator getjSeparator2()
    {
        return jSeparator2;
    }
    
    public void setjSeparator2(javax.swing.JSeparator jSeparator2)
    {
        this.jSeparator2 = jSeparator2;
    }
    
    public JEditorPane getDescEditPane()
    {
        return descEditPane;
    }
    
    public void setDescEditPane(JEditorPane descEditPane)
    {
        this.descEditPane = descEditPane;
    }
    
    public Font getFont()
    {
        return font;
    }
    
    public void setFont(Font font)
    {
        this.font = font;
    }
    
    public JEditorPane getCodeEditPane()
    {
        return codeEditPane;
    }
    
    public void setCodeEditPane(JEditorPane codeEditPane)
    {
        this.codeEditPane = codeEditPane;
    }
    
    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    public JTable getjTable1()
    {
        return jTable1;
    }

    public void setjTable1(JTable jTable1)
    {
        this.jTable1 = jTable1;
    }

    public DefaultTableModel getTableMode1()
    {
        return tableMode1;
    }

    public void setTableMode1(DefaultTableModel tableMode1)
    {
        this.tableMode1 = tableMode1;
    }

    public JScrollPane getTableJscroll()
    {
        return tableJscroll1;
    }

    public void setTableJscroll(JScrollPane tableJscroll)
    {
        this.tableJscroll1 = tableJscroll;
    }

    public JButton getAddUser()
    {
        return addSort;
    }

    public void setAddUser(JButton addUser)
    {
        this.addSort = addUser;
    }

    public JButton getDeleteUser()
    {
        return deleteSort;
    }

    public void setDeleteUser(JButton deleteUser)
    {
        this.deleteSort = deleteUser;
    }

    public Boolean getIsSuccess()
    {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess)
    {
        this.isSuccess = isSuccess;
    }

    public JScrollPane getPaneJscroll()
    {
        return paneJscroll;
    }

    public void setPaneJscroll(JScrollPane paneJscroll)
    {
        this.paneJscroll = paneJscroll;
    }

    public JPanel getInputPanel()
    {
        return inputPanel;
    }

    public void setInputPanel(JPanel inputPanel)
    {
        this.inputPanel = inputPanel;
    }

    public JPanel getOutputPanel()
    {
        return outputPanel;
    }

    public void setOutputPanel(JPanel outputPanel)
    {
        this.outputPanel = outputPanel;
    }

    public ScrollPane getDescEditPaneJscroll()
    {
        return descEditPaneJscroll;
    }

    public void setDescEditPaneJscroll(ScrollPane descEditPaneJscroll)
    {
        this.descEditPaneJscroll = descEditPaneJscroll;
    }

    public ScrollPane getCodeEditPaneJscroll()
    {
        return codeEditPaneJscroll;
    }

    public void setCodeEditPaneJscroll(ScrollPane codeEditPaneJscroll)
    {
        this.codeEditPaneJscroll = codeEditPaneJscroll;
    }

    public javax.swing.JLabel getInputLabel1()
    {
        return inputLabel1;
    }

    public void setInputLabel1(javax.swing.JLabel inputLabel1)
    {
        this.inputLabel1 = inputLabel1;
    }

    public javax.swing.JTextField getInputText1()
    {
        return inputText1;
    }

    public void setInputText1(javax.swing.JTextField inputText1)
    {
        this.inputText1 = inputText1;
    }

    public javax.swing.JLabel getInputLabel2()
    {
        return inputLabel2;
    }

    public void setInputLabel2(javax.swing.JLabel inputLabel2)
    {
        this.inputLabel2 = inputLabel2;
    }

    public javax.swing.JTextField getInputText2()
    {
        return inputText2;
    }

    public void setInputText2(javax.swing.JTextField inputText2)
    {
        this.inputText2 = inputText2;
    }

    public JPanel getInputPanel3()
    {
        return inputPanel3;
    }

    public void setInputPanel3(JPanel inputPanel3)
    {
        this.inputPanel3 = inputPanel3;
    }

    public JScrollPane getTableJscroll1()
    {
        return tableJscroll1;
    }

    public void setTableJscroll1(JScrollPane tableJscroll1)
    {
        this.tableJscroll1 = tableJscroll1;
    }

    public JButton getAddSort()
    {
        return addSort;
    }

    public void setAddSort(JButton addSort)
    {
        this.addSort = addSort;
    }

    public JButton getDeleteSort()
    {
        return deleteSort;
    }

    public void setDeleteSort(JButton deleteSort)
    {
        this.deleteSort = deleteSort;
    }

    public JTable getjTable2()
    {
        return jTable2;
    }

    public void setjTable2(JTable jTable2)
    {
        this.jTable2 = jTable2;
    }

    public DefaultTableModel getTableMode2()
    {
        return tableMode2;
    }

    public void setTableMode2(DefaultTableModel tableMode2)
    {
        this.tableMode2 = tableMode2;
    }

    public JScrollPane getTableJscroll2()
    {
        return tableJscroll2;
    }

    public void setTableJscroll2(JScrollPane tableJscroll2)
    {
        this.tableJscroll2 = tableJscroll2;
    }

    public JButton getAddFilter()
    {
        return addFilter;
    }

    public void setAddFilter(JButton addFilter)
    {
        this.addFilter = addFilter;
    }

    public JButton getDeleteFilter()
    {
        return deleteFilter;
    }

    public void setDeleteFilter(JButton deleteFilter)
    {
        this.deleteFilter = deleteFilter;
    }

}
