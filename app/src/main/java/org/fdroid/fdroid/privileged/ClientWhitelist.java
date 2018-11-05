/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * <ol>
 * <li>Get SHA-256 of certificate as lowercase without colons with
 * <code>keytool -printcert -jarfile com.example.apk | sed -n 's,SHA256:\s*\([A-F0-9:]*\),\1,p' | sed 's,:,,g'
 * | tr A-f a-f</code></li>
 * <li>Add here with Application ID</li>
 * </ol>
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/FDroid.apk
            new Pair<>("org.fdroid.fdroid", "A78DAF79F658BA3242ADE851637FEA184AF53DAF306C9131209FC5DC634A9396"), // bullhead releasekey
            new Pair<>("org.fdroid.fdroid", "0E39376C3DFD4DE49EDEBD0E4629CF94B9C40C01D5B284B2112F2FF088FAD351"), // angler releasekey
            new Pair<>("org.fdroid.fdroid", "6E461BDB712AC6A0CC3251B1DFEDD96C367E814116D9816D550E9DB606C1F628"), // marlin releasekey
            new Pair<>("org.fdroid.fdroid", "2C679B2951D7D1D54DA1534AE8B7FF1681B195806E34985D040C9B9D6CB48874"), // sailfish releasekey
            new Pair<>("org.fdroid.fdroid", "03F03912587E3DD68AB91F9165D35AFB04DF38BBFC38161C0D2592A6D385676F"), // taimen releasekey
            new Pair<>("org.fdroid.fdroid", "B2D735F2B2BCA4DB548BBD606776AACD81AFE5430BC24C369D151D1AAF993D9F")  // walleye releasekey
    ));

}
