package com.mckimquyen.barcodescanner.extension

import android.net.Uri

fun Uri.Builder.appendQueryParameterIfNotNullOrBlank(
    key: String,
    value: String?,
): Uri.Builder {
    if (value.isNullOrBlank().not()) {
        appendQueryParameter(
            /* key = */ key,
            /* value = */ value
        )
    }
    return this
}
