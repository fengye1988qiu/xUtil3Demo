package com.leo.xutil3demo.ui.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.leo.xutil3demo.BaseActivity;
import com.leo.xutil3demo.R;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.msg.MessageBuilder;
import com.netease.nimlib.sdk.msg.MsgService;
import com.netease.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.netease.nimlib.sdk.msg.model.IMMessage;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_chat)
public class ChatActivity extends BaseActivity {

    @ViewInject(R.id.bt_chat)
    private Button btSend;

    @ViewInject(R.id.tv_chat_log)
    private TextView tvChatLog;

    @ViewInject(R.id.tv_chat_email)
    private TextView tvChatEmail;


    @ViewInject(R.id.tv_chat_content)
    private TextView tvChatContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Event(value = R.id.bt_chat)
    private void onClick(View v){

        String id = tvChatEmail.getText().toString().trim();
        String content = tvChatContent.getText().toString().trim();
        IMMessage msg = new MessageBuilder().createTextMessage(id, SessionTypeEnum.P2P,content);
        NIMClient.getService(MsgService.class).sendMessage(msg,true);

    }
}
