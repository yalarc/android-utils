/*
 * Copyright (c) 2017. shixinzhang (shixinzhang2016@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.shixinzhang.utils;

import android.os.Environment;

import java.io.File;

/**
 * <br> Description: 保存一些手机、设备的基本信息
 * <p>
 * <br> Created by shixinzhang on 17/4/24.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <a  href="https://about.me/shixinzhang">About me</a>
 */

public class AppInfo {
    public final static String DIRECTORY_NAME = "shixinzhang";

    public final static String DIRECTORY_PATH = Environment.getExternalStorageDirectory() + File.separator + DIRECTORY_NAME + File.separator;

    //文件下载目录
    public final static String DOWNLOAD_PATH = DIRECTORY_NAME + File.separator + "download";

    //APK 下载目录
    public final static String DOWNLOAD_APK_PATH = DOWNLOAD_PATH + File.separator + "your_app_new_version.apk";

    //文件下载绝对目录
    public final static String DOWNLOAD_ABS_PATH = AppInfo.DIRECTORY_PATH + File.separator + "download" + File.separator;

    public final static String DOWNLOAD_URI = "file:///" + DIRECTORY_PATH + File.separator + "download";

}
