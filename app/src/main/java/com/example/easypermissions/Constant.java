package com.example.easypermissions;

import android.Manifest;

public class Constant {

    public static class Permission {

        // 请求码
        public static final int REQUEST_CALL_PHONE = 0x01;  // 打电话
        public static final int REQUEST_PHONE_AUDIO = 0x02;  // 电话、录音
        public static final int REQUEST_CODE_STORE_LOCATION_AUDIO = 0x03;  // 存储、定位、语音权限

        public static final String[] PERMS_STORE_LOCATION_AUDIO = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.RECORD_AUDIO
        };

    }

}
