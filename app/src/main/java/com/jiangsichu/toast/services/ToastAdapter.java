package com.jiangsichu.toast.services;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jiangsichu.toast.R;
import com.jiangsichu.toast.models.Toast;

import java.util.List;

public class ToastAdapter extends ArrayAdapter<Toast> {

    public ToastAdapter(Context context, int resource, List<Toast> toasts) {
        super(context, resource, toasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item_toast, parent, false);
        }

        Toast toast = getItem(position);

        if (toast != null) {
            TextView toasterTextView = (TextView) view.findViewById(R.id.textview_toaster);
            TextView toasteeTextView = (TextView) view.findViewById(R.id.textview_toastee);
            TextView messageTextView = (TextView) view.findViewById(R.id.textview_message);
            TextView dateTextView = (TextView) view.findViewById(R.id.textview_date);

            if (toasterTextView != null) {
                toasterTextView.setText(toast.sender.userName);
            }

            if (toasteeTextView != null) {
                toasteeTextView.setText(toast.getRecipientsString());
            }

            if (messageTextView != null) {
                messageTextView.setText(toast.message);
            }

            if (dateTextView != null) {
                dateTextView.setText(toast.utcTimeStamp.toString());
            }
        }

        return view;
    }
}
