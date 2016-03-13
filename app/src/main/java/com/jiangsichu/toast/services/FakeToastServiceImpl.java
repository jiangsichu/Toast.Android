package com.jiangsichu.toast.services;

import android.widget.ArrayAdapter;

import com.jiangsichu.toast.models.Recipient;
import com.jiangsichu.toast.models.TextRecipient;
import com.jiangsichu.toast.models.Toast;
import com.jiangsichu.toast.models.User;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

// only for testing
public class FakeToastServiceImpl implements ToastService {

    private static Random random = new Random();

    @Override
    public void updateToasts(ArrayAdapter<Toast> toastAdapter) {
        toastAdapter.clear();
        for (int i = 0; i < 20; i++) {
            toastAdapter.add(generateFakeToast());
        }
    }

    private static Toast generateFakeToast() {
        return new Toast(
                new User("sender" + random.nextInt(10), null, null, null),
                Arrays.asList(new Recipient[]{new TextRecipient("recipient" + random.nextInt(10))}),
                "Hello Toaster! This is a test message.",
                new Date()
        );
    }
}
