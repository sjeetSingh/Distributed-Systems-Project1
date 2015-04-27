/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroomclient;
import java.util.*;
import javax.swing.*;
/* Team Information

*Mohammed Fahad Kaleem(1000969369)
*Nitin Kamani(1000919137)
*Sarabjeet Singh(1001115369)
*Mohammed Mudassir Ahmed(1001108922)

*/
public class ChatRoom extends javax.swing.JFrame {

    /**
     * Creates new form ChatRoom
     */
    App app;
    public ChatRoom() {
        initComponents();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRoom = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbmRoom = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        btnSaveChat = new javax.swing.JButton();
        btnChatLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select a chat room and click on Add Room");

        lstRoom.setToolTipText("");
        jScrollPane1.setViewportView(lstRoom);

        jButton1.setText("Join Chat Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Chat Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbmRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USA", "Tokio" }));

        jButton3.setText("Add Room");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSaveChat.setText("Save Chat");
        btnSaveChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChatActionPerformed(evt);
            }
        });

        btnChatLog.setText("View History");
        btnChatLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbmRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(btnSaveChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChatLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 147, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbmRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSaveChat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChatLog, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setApp(App app)
    {
        this.app=app;
        this.setTitle("Welcome to "+app.name+" ");
    }
    //add room that user choise to chat room
    public void addCurentRoom(String roomid)
    {
        if(!checkCurentRoom(roomid))
        {
            dim.addElement(roomid);
            lstRoom.setModel(dim);
        }
    }
    //remove room that user choise to chat room
    public void removeCurentRoom(String roomid)
    {
         if(!checkCurentRoom(roomid))
        {
            dim.removeElement(roomid);
            lstRoom.setModel(dim);
        }
    }
    
    //check room that user choise to chat room
    public boolean checkCurentRoom(String roomid)
    {
        for(int i=0;i<dim.getSize();i++)
        {
            if(dim.getElementAt(i).toString().contains(roomid))return true;
        }
        return false;
    }

    @Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }
    DefaultListModel dim=new DefaultListModel();
    DefaultComboBoxModel combox=new DefaultComboBoxModel();
    
    //add a roomid from list roomid of server
    public void addRoom(String roomid)
    {
        if(!checkRoom(roomid))
        {
            combox.addElement(roomid);
            
        }
        cbmRoom.setModel(combox);
    }
    
    //update a roomid from list roomid of server when user create room
    public void updateRoom(String roomid,String count)
    {
        if(checkCurentRoom(roomid.trim()))
        {
            deleteRoom(roomid);
            dim.addElement(roomid+" ("+count+")");
            lstRoom.setModel(dim);
        }
    }
    //delete a room
    private void deleteRoom(String roomid)
    {
        for(int i=0;i<dim.getSize();i++)
        {
            if(dim.getElementAt(i).toString().contains(roomid))dim.removeElementAt(i);
        }
        
    }
    
    //check room in list
    private boolean checkRoom(String roomid)
    {
        for(int i=0;i<combox.getSize();i++)
        {
            if(combox.getElementAt(i).toString().equalsIgnoreCase(roomid))return true;
        }
        return false;
    }
    
    //
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name= lstRoom.getSelectedValue()+"";
        StringTokenizer strTokToken =
            new StringTokenizer(name, "(", false);
        
        name=strTokToken.nextToken().trim();// get roomid examole Tokio (3) => roomid is Tokio
        
        Chat ui=app.client.getUIMessage(name);
        if(ui==null)
        {
            //if the chat window is null then create new
            ui=new Chat();
            ui.setName(name);
            ui.setRoomId(name);
            ui.setApp(app);
            app.client.addMessage(ui);
        }
        //Send a message join room to server
        String message=app.name+MessageChat.dotMsg+MessageChat.JoininRoom+MessageChat.dotMsg+
                    name+MessageChat.dotMsg+name;
            app.client.sendMessage(message);
            ui.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //call new chat room
        NewChatRoom newchatroom=new NewChatRoom();
        newchatroom.setApp(app);
        newchatroom.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSaveChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChatActionPerformed
        // TODO add your handling code here:
        //save chat to history
        SaveChat sv=new SaveChat();
        sv.setApp(app);
        sv.show();
    }//GEN-LAST:event_btnSaveChatActionPerformed

    private void btnChatLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatLogActionPerformed
        // TODO add your handling code here:
        //call history windows to show history chat
        History h=new History();
        h.setApp(app);
        h.show();
    }//GEN-LAST:event_btnChatLogActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        // send message to server to update user count in roomid
        String roomid=cbmRoom.getSelectedItem()+"";
        addCurentRoom(roomid);
        String message=app.name+MessageChat.dotMsg+MessageChat.RoomCount+MessageChat.dotMsg+
                    roomid+MessageChat.dotMsg+roomid;
        app.client.sendMessage(message);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChatLog;
    private javax.swing.JButton btnSaveChat;
    private javax.swing.JComboBox cbmRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstRoom;
    // End of variables declaration//GEN-END:variables
}
