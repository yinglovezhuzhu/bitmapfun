/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.opensource.bitmapfun.provider;

import com.android.opensource.bitmapfun.util.ImageWorker.ImageWorkerAdapter;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     */
    public final static String[] imageUrls = new String[] {
        "http://images.55bbs.com/55shuoimg/pic/68/e9/e8/68e9e897d294187346ee3a05edce4580610x14989.jpg",
        "http://desk.blueidea.com/DESK/QTBZ/dwbz/dwbz010.jpg",
        "http://images.55bbs.com/55shuoimg/pic/46/9b/16/469b167bc825e00fd53b5371f6c598e8610x14989.jpg",
        "http://www.ii123.com/uploads/allimg/c121123/1353A261D0460-410C.jpg",
        "http://images.55bbs.com/55shuoimg/pic/7e/d2/28/7ed22873027c429a28ae702b19fce17b610x14989.jpg", 
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     */
    public static String[] imageThumbUrls = new String[] {
        "http://p0.so.qhimg.com/sdr/200_200_/t01ff46ff98aea72e05.jpg",
        "http://p2.so.qhimg.com/sdr/200_200_/t01d8c66378cbe51162.jpg",
        "http://p2.so.qhimg.com/sdr/200_200_/t01dfab67c68e80fd67.jpg",
        "http://p2.so.qhimg.com/sdr/200_200_/t01cf258dbfff8c319c.jpg",
    };

    /**
     * Simple static adapter to use for images.
     */
    public final static ImageWorkerAdapter imageWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageUrls.length;
        }
    };

    /**
     * Simple static adapter to use for image thumbnails.
     */
    public final static ImageWorkerAdapter imageThumbWorkerUrlsAdapter = new ImageWorkerAdapter() {
        @Override
        public Object getItem(int num) {
            return Images.imageThumbUrls[num];
        }

        @Override
        public int getSize() {
            return Images.imageThumbUrls.length;
        }
    };
}
