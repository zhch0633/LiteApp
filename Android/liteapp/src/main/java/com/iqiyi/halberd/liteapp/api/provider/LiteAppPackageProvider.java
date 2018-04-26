/**
 *
 * Copyright 2018 iQIYI.com
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
 *
 */
package com.iqiyi.halberd.liteapp.api.provider;

/**
 * Created by xujiajia_sx on 2017/8/1.
 * using this provider to provide lite app package client
 */

public class LiteAppPackageProvider {
    public static LiteAppPackageClient getClient() {
        return mClient;
    }

    public static void setClient(LiteAppPackageClient client) {
        mClient = client;
    }

    private static LiteAppPackageClient mClient;
}