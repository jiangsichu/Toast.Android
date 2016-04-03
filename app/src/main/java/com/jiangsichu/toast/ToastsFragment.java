package com.jiangsichu.toast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jiangsichu.toast.models.Toast;
import com.jiangsichu.toast.services.FakeToastServiceImpl;
import com.jiangsichu.toast.services.ToastAdapter;
import com.jiangsichu.toast.services.ToastService;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class ToastsFragment extends Fragment {

    private ToastAdapter toastAdapter;
    private ToastService toastService;

    public ToastsFragment() {
        // TODO: replace this with real implementation once signalR is configured
        toastService = new FakeToastServiceImpl();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        toastAdapter = new ToastAdapter(
                getActivity(),
                R.layout.list_item_toast,
                new ArrayList<Toast>()
        );

        View rootView = inflater.inflate(R.layout.fragment_toasts, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_toasts);
        listView.setAdapter(toastAdapter);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        toastService.updateToasts(toastAdapter);
    }
}
