package br.com.myapplication.whatsappclone.ui.chatscreen;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import br.com.myapplication.whatsappclone.R;
import br.com.myapplication.whatsappclone.ui.models.Message;


/**
 * Created by vihaan on 18/06/17.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {


    public ImageView chatIV;
    public TextView chatTV;
    public TextView timeTV;

    public MessageViewHolder(View itemView) {
        super(itemView);

        chatIV = (ImageView)itemView.findViewById( R.id.chatIV );
        chatTV = (TextView)itemView.findViewById( R.id.chatTV );
        timeTV = (TextView)itemView.findViewById( R.id.timeTV );
    }

    public void bindToMessage(Message message, View.OnClickListener starClickListener) {

//        if (!TextUtils.isEmpty(user.getProfilePicUrl())) {
//            Picasso.with(userIV.getContext()).load(user.getProfilePicUrl()).into(userIV);
//        }
        chatTV.setText(message.getData());
    }

}
