package com.example.effe_21ca.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.effe_21ca.databinding.FragmentNotificationsBinding;
import com.google.firebase.database.FirebaseDatabase;

public class NotificationsFragment extends Fragment {
    //FirebaseDatabase database;

    private NotificationsViewModel notificationsViewModel;
private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

//        database = FirebaseDatabase.getInstance();\
//        String name = getIntent().getStringExtra("name");

    binding = FragmentNotificationsBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

//        final TextView textView = binding.textNotifications;
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}