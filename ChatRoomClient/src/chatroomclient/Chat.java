/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroomclient;
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/* Team Information

*Mohammed Fahad Kaleem(1000969369)
*Nitin Kamani(1000919137)
*Sarabjeet Singh(1001115369)
*Mohammed Mudassir Ahmed(1001108922)

*/

/*
References:


Socket Chat referred from :http://www.cn-java.com/download/data/book/socket_chat.pdf
                           https://www.youtube.com/watch?v=PDCAnKX2kkY
                           https://www.youtube.com/watch?v=qWYn1omeqqs(just got an idea of the GUI from here)
                           https://www.youtube.com/watch?v=fSQOhFYgE3s
                           https://www.youtube.com/watch?v=6G_W54zuadg&spfreload=10%20Message%3A%20Unexpected%20end%20of%20input%20(url%3A%20https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D6G_W54zuadg)

Login and Register        :https://www.youtube.com/watch?v=lJ-quz0uri4
                           https://www.youtube.com/watch?v=CPottYpf9ag

JList                     :https://www.youtube.com/watch?v=9Ejx6YCnYmk
Database                  :https://www.youtube.com/watch?v=fbYxThOFsLI
                           https://www.youtube.com/watch?v=BCqW5XwtJxY
Setup Appserv   `         :https://www.youtube.com/watch?v=NVgYOn5QvAE
                           https://www.youtube.com/watch?v=Nic73WekoFs&spfreload=10%20Message%3A%20Unexpected%20end%20of%20input%20(url%3A%20https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DNic73WekoFs)


*/

 /*The message is: name|command|IDroom|message
        =>to login send message: name|@login|0|username|password
        =>to register send message: name|@register|0|username|password
        =>to create room send message:name|@create|0|roomname
        =>to logout send message: name|@logout|0|logout
        =>to chat send message: name|@chat|idroom|message
        */
public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    App app;
    String roomID;
    public Chat() {
        initComponents();
    }
    //set app
    public void setApp(App app)
    {
        this.app=app;
    }
    //set room name
    public void setRoomId(String room)
    {
        roomID=room;
        this.setTitle(room+" room");
    }
    DefaultListModel dim=new DefaultListModel();
    //check user in room
    private boolean checkUser(String user)
    {
        for(int i=0;i<dim.getSize();i++)
        {
            if(dim.get(i).toString().equalsIgnoreCase(user.trim()))return true;
        }
        return false;
    }
    //add user when user join in room
    public void addUser(String user)
    {
        user=user.trim();
        if(!checkUser(user))
        {
            dim.addElement(user);
            txtComment.append(user+" has just joined the room\n");
        }
        listUsers.setModel(dim);
        
        
        
    }
    //remove user when user join out room
    public void removeUser(String user)
    {
        dim.removeElement(user);
        listUsers.setModel(dim);
        txtComment.append(user+" just left the room\n");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLeave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();

        setTitle("China");

        btnLeave.setText("Leave Conversation");
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Online Users");

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMessageKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtMessage);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listUsers);

        txtComment.setColumns(1);
        txtComment.setRows(5);
        jScrollPane4.setViewportView(txtComment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnLeave, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLeave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // send message to chatroom id
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String message=app.name+MessageChat.dotMsg+MessageChat.Chat+MessageChat.dotMsg+
                    this.roomID+MessageChat.dotMsg+txtMessage.getText();
        app.client.sendMessage(message);
        txtMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    //get value of textbox
    public String getValue()
    {
        return txtComment.getText();
    }
    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        // TODO add your handling code here:
        String message=app.name+MessageChat.dotMsg+MessageChat.JoinoutRoom+MessageChat.dotMsg+
                    this.roomID+MessageChat.dotMsg+app.name;
        app.client.sendMessage(message);
        this.hide();
        app.chatroom.removeCurentRoom(roomID);
    }//GEN-LAST:event_btnLeaveActionPerformed

    private void txtMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==10)
        {
            String message=app.name+MessageChat.dotMsg+MessageChat.Chat+MessageChat.dotMsg+
                    this.roomID+MessageChat.dotMsg+txtMessage.getText();
            app.client.sendMessage(message);
            txtMessage.setText("");
        }
    }//GEN-LAST:event_txtMessageKeyPressed
     
    // insert message to textbox        
    public void receiveMessage(String msg)
    {
        txtComment.append(msg+"\n");
    }
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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listUsers;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}