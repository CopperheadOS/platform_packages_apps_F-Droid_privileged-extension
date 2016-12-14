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
 * 1. Get SHA-256 of certificate with
 * keytool -list -printcert -jarfile com.example.apk
 * 2. Add here as lowercase without colons
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/FDroid.apk
            new Pair<>("org.fdroid.fdroid", "67760df25e94ae6c955d9e17ca1bc8e195da5d91d5a58023805ab3579463d1b8"), // legacy releasekey
            new Pair<>("org.fdroid.fdroid", "449391570558013f23a3cd06330bc4718b18b1d910f5161c3f68270d60d72904"), // legacy platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "6425C9DE6219056CCE62F73E7AD9F92C940B83BAC1D5516ABEBCE1D38F85E4CF"), // marlin releasekey
            new Pair<>("org.fdroid.fdroid", "CC1E06EAD3E9CA2C4E46073172E92BAD4AFB02D4D21EDDC3F4D9A50C2FBD639D"), // marlin platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "B919FFF979EAC18DF3E65C6D2EBE63F393F11B4BAB344ADE255B2465F49836BC"), // sailfish releasekey
            new Pair<>("org.fdroid.fdroid", "1C3FBC736E9B7B09E309B8379FF954BF5BD9F95ED399741D7D1D3A42F8ADB757"), // sailfish platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "12AB56E8D6411DC215448EAC69DFC21AB28164B79DBD3EADD1C70D6A70CD862A"), // taimen releasekey
            new Pair<>("org.fdroid.fdroid", "7CF1C0DD717C52C6EB2B6430E140A586AC5E7652BF0F0D40F428302D735E4CC2")  // walleye releasekey
    ));

}
