package com.lance.nfc.nfc

import android.content.Context
import android.nfc.NfcAdapter


/**
 * 检查是否开启NFC权限
 * */
fun checkNFCPermission(context: Context): Boolean {
    val nfcAdapter = NfcAdapter.getDefaultAdapter(context)
    return nfcAdapter?.isEnabled ?: false
}

/**
 * 读取NFC标签的数据
 * */
fun readNFC() {

}

/**
 * NFC Write card
 * */
fun writeNFC() {

}
