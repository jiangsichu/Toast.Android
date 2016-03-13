package com.jiangsichu.toast.services;

import android.widget.ArrayAdapter;

import com.jiangsichu.toast.models.Toast;
import java.util.List;

public interface ToastService {
    void updateToasts(ArrayAdapter<Toast> toastAdapter);
}