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
import com.huawei.esdk.csdemo.view.utils.InternationalUtils;

public class ScheduleConf extends MyTabPane
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = 3296547845318987007L;

    //输入
    //第一个输入框
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JTextField inputText1;
    //第二个输入框
    private javax.swing.JLabel inputLabel2;
    private javax.swing.JTextField inputText2;
    //第三个输入框
    private javax.swing.JLabel inputLabel3;
    private javax.swing.JTextField inputText3;
    //第四个输入框
    private javax.swing.JLabel inputLabel4;
    private javax.swing.JTextField inputText4;
    
    private javax.swing.JLabel inputLabel5;
    private javax.swing.JTextField inputText5;
    private javax.swing.JLabel inputLabel6;
    private javax.swing.JTextField inputText6;
    private javax.swing.JLabel inputLabel7;
    private javax.swing.JTextField inputText7;
    private javax.swing.JLabel inputLabel8;
    private javax.swing.JTextField inputText8;
    
    private javax.swing.JLabel inputLabel9;
    private javax.swing.JTextField inputText9;
    private javax.swing.JLabel inputLabel10;
    private javax.swing.JTextField inputText10;
    
    private javax.swing.JLabel inputLabel11;
    private javax.swing.JTextField inputText11;
    private javax.swing.JLabel inputLabel12;
    private javax.swing.JTextField inputText12;
    
    private javax.swing.JLabel inputLabel13;
    private javax.swing.JTextField inputText13;
    private javax.swing.JLabel inputLabel14;
    private javax.swing.JTextField inputText14;
    
    private javax.swing.JLabel inputLabel15;
    private javax.swing.JTextField inputText15;
    private javax.swing.JLabel inputLabel16;
    private javax.swing.JTextField inputText16;
    
    private javax.swing.JLabel inputLabel17;
    private javax.swing.JTextField inputText17;
    private javax.swing.JLabel inputLabel18;
    private javax.swing.JTextField inputText18;
    
    private JTable jTable1;
    private DefaultTableModel tableMode1;
    private JScrollPane tableJscroll;
    private JButton addUser;
    private JButton deleteUser;
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
        inputText1 = new javax.swing.JTextField("CS DEMO");
        inputLabel2 = new javax.swing.JLabel();
//        inputText2 = new javax.swing.JTextField("yyyy/MM/dd hh:mm:ss");
        inputText2 = new javax.swing.JTextField("2015/02/02 11:00:00");
        inputLabel3 = new javax.swing.JLabel();
        inputText3 = new javax.swing.JTextField("30");
        inputLabel4 = new javax.swing.JLabel();
        inputText4 = new javax.swing.JTextField();
        inputLabel5 = new javax.swing.JLabel();
        inputText5 = new javax.swing.JTextField();
        inputLabel6 = new javax.swing.JLabel(); 
        inputText6 = new javax.swing.JTextField();
        inputLabel7 = new javax.swing.JLabel();
        inputText7 = new javax.swing.JTextField("0");
        inputLabel8 = new javax.swing.JLabel();
        inputText8 = new javax.swing.JTextField();
        inputLabel9 = new javax.swing.JLabel();
        inputText9 = new javax.swing.JTextField();
        inputLabel10 = new javax.swing.JLabel();
        inputText10 = new javax.swing.JTextField("0");
        
        inputLabel11 = new javax.swing.JLabel();
        inputText11 = new javax.swing.JTextField();
        inputLabel12 = new javax.swing.JLabel();
        inputText12 = new javax.swing.JTextField("0");
        inputLabel13 = new javax.swing.JLabel();
        inputText13 = new javax.swing.JTextField("0");
        inputLabel14 = new javax.swing.JLabel();
        inputText14 = new javax.swing.JTextField();
        
        inputLabel15 = new javax.swing.JLabel();
        inputText15 = new javax.swing.JTextField();
        inputLabel16 = new javax.swing.JLabel();
        inputText16 = new javax.swing.JTextField();
        
        inputLabel17 = new javax.swing.JLabel();
        inputText17 = new javax.swing.JTextField();
        inputLabel18 = new javax.swing.JLabel();
        inputText18 = new javax.swing.JTextField();
        
        jTable1 = new javax.swing.JTable();
        tableMode1 = new DefaultTableModel();
        tableJscroll = new JScrollPane();
        addUser = new JButton();
        deleteUser = new JButton();
        
        jSeparator1 = new javax.swing.JSeparator();
        statusPanel = new javax.swing.JLabel();

        jSeparator2 = new javax.swing.JSeparator();

        outputLabel2 = new javax.swing.JLabel();
        outputText2 = new javax.swing.JTextField();
        outputLabel1 = new javax.swing.JLabel();
        outputText1 = new javax.swing.JTextField();
 
        descEditPane.setContentType("text/html;charset=utf-8");
        descEditPane.setEditable(false);
        descEditPane.setPreferredSize(new Dimension(getWidth(), 2750));
        descEditPaneJscroll.add(descEditPane);
        
        this.setPreferredSize(getSize());
        this.addTab("说明", descEditPaneJscroll);
    
        statusPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusPanel.setText("");
    
        //输入框
        inputPanel = new JPanel();
        inputPanel.setBorder(BorderFactory.createTitledBorder("输入"));
        
        
        //用户列表
        //查询条件列表
        JPanel inputPanel2 = new JPanel();
        jTable1.setEnabled(true);
//        tableJscroll.setBounds(20, 130, 500, 100);
        tableJscroll.setBorder(BorderFactory.createTitledBorder("成员列表"));
        tableJscroll.add(jTable1);
        tableJscroll.setViewportView(jTable1);
        //初始化查询条件列表
//        initConditionTableMode();
        jTable1.setModel(tableMode1);
        tableMode1.fireTableDataChanged();
        
        javax.swing.GroupLayout table1Layout = new javax.swing.GroupLayout(inputPanel2);
        inputPanel2.setLayout(table1Layout);
        table1Layout.setHorizontalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addComponent(tableJscroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(10, 10, 20)
                .addComponent(addUser)
                .addGap(20, 20, 100)
                .addComponent(deleteUser)
                .addGap(20, 20, 100)
                .addComponent(actionBtn))
            );
        table1Layout.setVerticalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,true)
            .addGroup(table1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tableJscroll, 120, 120, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUser)
                    .addComponent(deleteUser)
                    .addComponent(actionBtn)))
        );
        
      //用户列表结束
        
        JPanel inputPanel1 = new JPanel();
        
        GroupLayout jPanel2Layout = new GroupLayout(inputPanel1);
        inputPanel1.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
                    .addComponent(inputLabel1, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel2, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel3, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel4, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel9, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel11, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel12, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel15, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel17, 130, 130, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, true)
                    .addComponent(inputText1, 100, 100, Short.MAX_VALUE)
                    .addComponent(inputText2,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText3,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText4,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText9,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText11,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText12,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText15,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText17,  100, 100, Short.MAX_VALUE))
                .addGap(20, 20, 50)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, false)
                    .addComponent(inputLabel5, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel6, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel7, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel8, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel10, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel13, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel14, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel16, 130, 130, Short.MAX_VALUE)
                    .addComponent(inputLabel18, 130, 130, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER, true)
                    .addComponent(inputText5, 100, 100, Short.MAX_VALUE)
                    .addComponent(inputText6,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText7,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText8,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText10,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText13,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText14,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText16,  100, 100, Short.MAX_VALUE)
                    .addComponent(inputText18,  100, 100, Short.MAX_VALUE))
                    .addContainerGap(10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))




.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
    .addComponent(inputLabel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    .addComponent(inputText15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    .addComponent(inputLabel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    .addComponent(inputText16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)


.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLabel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

                    
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(30, Short.MAX_VALUE))

            );

        
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addComponent(inputPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER,true)
            .addGroup(layout1.createSequentialGroup()
                .addComponent(inputPanel1, 250, 250, 250)
                .addComponent(inputPanel2, 180, 180, 180)
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
                .addComponent(inputPanel, 470, 470, GroupLayout.PREFERRED_SIZE)
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
        
        addUser.addMouseListener(new MouseAdapter()
        {
            
            @Override
            public void mouseClicked(MouseEvent e)
            {
                
                tableMode1.addRow(new String[] {"", "", "","", "", "", "", "", "", ""});
            }
            
        });
        
        deleteUser.addMouseListener(new MouseAdapter()
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
    }

    @Override
    public void International(int languageFlag){
        InternationalUtils.languageFlag = languageFlag;
        this.setTitleAt(0, InternationalUtils.getValue("instruction"));
        this.setTitleAt(1, InternationalUtils.getValue("execute"));
        this.setTitleAt(2, InternationalUtils.getValue("code"));

        inputPanel.setBorder(BorderFactory.createTitledBorder((InternationalUtils.getValue("input"))));
        outputPanel.setBorder(BorderFactory.createTitledBorder((InternationalUtils.getValue("output"))));
        tableJscroll.setBorder(BorderFactory.createTitledBorder(InternationalUtils.getValue("siteList")));
        
        inputLabel1.setText(InternationalUtils.getValue("confName")+":");
        inputLabel2.setText(InternationalUtils.getValue("confBeginTime")+":");
        inputLabel3.setText(InternationalUtils.getValue("confDuration")+":");
        inputLabel4.setText(InternationalUtils.getValue("confAccessCode")+":");
        inputLabel9.setText(InternationalUtils.getValue("confPassword")+":");
        inputLabel11.setText(InternationalUtils.getValue("confChairManPassword")+":");
        
        inputLabel12.setText(InternationalUtils.getValue("mediaEncryptType")+":");
   
        inputLabel5.setText(InternationalUtils.getValue("auxVideoFormat")+":");
        inputLabel6.setText(InternationalUtils.getValue("auxVideoProtocol")+":");
        
        inputLabel7.setText(InternationalUtils.getValue("cpResouce")+":");
        inputLabel8.setText(InternationalUtils.getValue("rate")+":");
        inputLabel10.setText(InternationalUtils.getValue("isRecording")+":");      
        inputLabel13.setText(InternationalUtils.getValue("isLiveBroadcast")+":");
        
        inputLabel14.setText(InternationalUtils.getValue("presentation")+":");
        
        inputLabel15.setText(InternationalUtils.getValue("billCode")+":");
        inputLabel16.setText(InternationalUtils.getValue("mainSiteUri")+":");
        inputLabel17.setText(InternationalUtils.getValue("email")+":");
        inputLabel18.setText(InternationalUtils.getValue("content")+":");
            
        //国际化成员列表的标题栏
        Vector<String> titles = new Vector<String>();
        titles.add(InternationalUtils.getValue("confSite.uri"));
        titles.add(InternationalUtils.getValue("confSite.name"));
        titles.add(InternationalUtils.getValue("confSite.type"));
        titles.add(InternationalUtils.getValue("confSite.from"));
        titles.add(InternationalUtils.getValue("confSite.dialingMode"));
        titles.add(InternationalUtils.getValue("confSite.rate"));
        titles.add(InternationalUtils.getValue("confSite.videoFormat"));
        titles.add(InternationalUtils.getValue("confSite.videoProtocol"));
        titles.add(InternationalUtils.getValue("confSite.isLockVideoSource"));
        titles.add(InternationalUtils.getValue("confSite.participantType"));
        Vector<Vector<String>> rows = new Vector<Vector<String>>();
        tableMode1.setDataVector(rows, titles);
        addUser.setText(InternationalUtils.getValue("addSite"));
        deleteUser.setText(InternationalUtils.getValue("deleteSite"));
        
        actionBtn.setText(InternationalUtils.getValue("createConf"));
        
        outputLabel1.setText(InternationalUtils.getValue("resultCode")+":");
        outputLabel2.setText(InternationalUtils.getValue("resultData")+":");
        
        showOperationStatus(isSuccess);
        
        if(0 == languageFlag){
            String htmlDesc = PropertiesUtils.getHtmlFromTxt("scheduleConf_zh.txt");
            descEditPane.setText(htmlDesc);
            String codeDesc = PropertiesUtils.getHtmlFromTxt("scheduleConf_code_zh.txt");
            codeEditPane.setText(codeDesc);
        }
        else if(1 == languageFlag)
        {
            String htmlDesc = PropertiesUtils.getHtmlFromTxt("scheduleConf_en.txt");
            descEditPane.setText(htmlDesc);
            String codeDesc = PropertiesUtils.getHtmlFromTxt("scheduleConf_code_en.txt");
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
    
    public javax.swing.JLabel getInputLabel3()
    {
        return inputLabel3;
    }
    
    public void setInputLabel3(javax.swing.JLabel inputLabel3)
    {
        this.inputLabel3 = inputLabel3;
    }
    
    public javax.swing.JTextField getInputText3()
    {
        return inputText3;
    }
    
    public void setInputText3(javax.swing.JTextField inputText3)
    {
        this.inputText3 = inputText3;
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
    
    public javax.swing.JTextField getInputText4()
    {
        return inputText4;
    }
    
    public void setInputText4(javax.swing.JTextField inputText4)
    {
        this.inputText4 = inputText4;
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

    public javax.swing.JTextField getInputText5()
    {
        return inputText5;
    }

    public void setInputText5(javax.swing.JTextField inputText5)
    {
        this.inputText5 = inputText5;
    }

    public javax.swing.JTextField getInputText6()
    {
        return inputText6;
    }

    public void setInputText6(javax.swing.JTextField inputText6)
    {
        this.inputText6 = inputText6;
    }

    public javax.swing.JTextField getInputText7()
    {
        return inputText7;
    }

    public void setInputText7(javax.swing.JTextField inputText7)
    {
        this.inputText7 = inputText7;
    }

    public javax.swing.JTextField getInputText8()
    {
        return inputText8;
    }

    public void setInputText8(javax.swing.JTextField inputText8)
    {
        this.inputText8 = inputText8;
    }

    public javax.swing.JTextField getInputText9()
    {
        return inputText9;
    }

    public void setInputText9(javax.swing.JTextField inputText9)
    {
        this.inputText9 = inputText9;
    }

    public javax.swing.JTextField getInputText10()
    {
        return inputText10;
    }

    public void setInputText10(javax.swing.JTextField inputText10)
    {
        this.inputText10 = inputText10;
    }

    public javax.swing.JTextField getInputText11()
    {
        return inputText11;
    }

    public void setInputText11(javax.swing.JTextField inputText11)
    {
        this.inputText11 = inputText11;
    }

    public javax.swing.JTextField getInputText12()
    {
        return inputText12;
    }

    public void setInputText12(javax.swing.JTextField inputText12)
    {
        this.inputText12 = inputText12;
    }

    public javax.swing.JTextField getInputText13()
    {
        return inputText13;
    }

    public void setInputText13(javax.swing.JTextField inputText13)
    {
        this.inputText13 = inputText13;
    }

    public javax.swing.JTextField getInputText14()
    {
        return inputText14;
    }

    public void setInputText14(javax.swing.JTextField inputText14)
    {
        this.inputText14 = inputText14;
    }

    public javax.swing.JLabel getInputLabel4()
    {
        return inputLabel4;
    }

    public void setInputLabel4(javax.swing.JLabel inputLabel4)
    {
        this.inputLabel4 = inputLabel4;
    }

    public javax.swing.JLabel getInputLabel5()
    {
        return inputLabel5;
    }

    public void setInputLabel5(javax.swing.JLabel inputLabel5)
    {
        this.inputLabel5 = inputLabel5;
    }

    public javax.swing.JLabel getInputLabel6()
    {
        return inputLabel6;
    }

    public void setInputLabel6(javax.swing.JLabel inputLabel6)
    {
        this.inputLabel6 = inputLabel6;
    }

    public javax.swing.JLabel getInputLabel7()
    {
        return inputLabel7;
    }

    public void setInputLabel7(javax.swing.JLabel inputLabel7)
    {
        this.inputLabel7 = inputLabel7;
    }

    public javax.swing.JLabel getInputLabel8()
    {
        return inputLabel8;
    }

    public void setInputLabel8(javax.swing.JLabel inputLabel8)
    {
        this.inputLabel8 = inputLabel8;
    }

    public javax.swing.JLabel getInputLabel9()
    {
        return inputLabel9;
    }

    public void setInputLabel9(javax.swing.JLabel inputLabel9)
    {
        this.inputLabel9 = inputLabel9;
    }

    public javax.swing.JLabel getInputLabel10()
    {
        return inputLabel10;
    }

    public void setInputLabel10(javax.swing.JLabel inputLabel10)
    {
        this.inputLabel10 = inputLabel10;
    }

    public javax.swing.JLabel getInputLabel11()
    {
        return inputLabel11;
    }

    public void setInputLabel11(javax.swing.JLabel inputLabel11)
    {
        this.inputLabel11 = inputLabel11;
    }

    public javax.swing.JLabel getInputLabel12()
    {
        return inputLabel12;
    }

    public void setInputLabel12(javax.swing.JLabel inputLabel12)
    {
        this.inputLabel12 = inputLabel12;
    }

    public javax.swing.JLabel getInputLabel13()
    {
        return inputLabel13;
    }

    public void setInputLabel13(javax.swing.JLabel inputLabel13)
    {
        this.inputLabel13 = inputLabel13;
    }

    public javax.swing.JLabel getInputLabel14()
    {
        return inputLabel14;
    }

    public void setInputLabel14(javax.swing.JLabel inputLabel14)
    {
        this.inputLabel14 = inputLabel14;
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
        return tableJscroll;
    }

    public void setTableJscroll(JScrollPane tableJscroll)
    {
        this.tableJscroll = tableJscroll;
    }

    public JButton getAddUser()
    {
        return addUser;
    }

    public void setAddUser(JButton addUser)
    {
        this.addUser = addUser;
    }

    public JButton getDeleteUser()
    {
        return deleteUser;
    }

    public void setDeleteUser(JButton deleteUser)
    {
        this.deleteUser = deleteUser;
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

    public javax.swing.JLabel getInputLabel15()
    {
        return inputLabel15;
    }

    public void setInputLabel15(javax.swing.JLabel inputLabel15)
    {
        this.inputLabel15 = inputLabel15;
    }

    public javax.swing.JTextField getInputText15()
    {
        return inputText15;
    }

    public void setInputText15(javax.swing.JTextField inputText15)
    {
        this.inputText15 = inputText15;
    }

    public javax.swing.JLabel getInputLabel16()
    {
        return inputLabel16;
    }

    public void setInputLabel16(javax.swing.JLabel inputLabel16)
    {
        this.inputLabel16 = inputLabel16;
    }

    public javax.swing.JTextField getInputText16()
    {
        return inputText16;
    }

    public void setInputText16(javax.swing.JTextField inputText16)
    {
        this.inputText16 = inputText16;
    }

    public javax.swing.JLabel getInputLabel17()
    {
        return inputLabel17;
    }

    public void setInputLabel17(javax.swing.JLabel inputLabel17)
    {
        this.inputLabel17 = inputLabel17;
    }

    public javax.swing.JTextField getInputText17()
    {
        return inputText17;
    }

    public void setInputText17(javax.swing.JTextField inputText17)
    {
        this.inputText17 = inputText17;
    }

    public javax.swing.JLabel getInputLabel18()
    {
        return inputLabel18;
    }

    public void setInputLabel18(javax.swing.JLabel inputLabel18)
    {
        this.inputLabel18 = inputLabel18;
    }

    public javax.swing.JTextField getInputText18()
    {
        return inputText18;
    }

    public void setInputText18(javax.swing.JTextField inputText18)
    {
        this.inputText18 = inputText18;
    }

}
