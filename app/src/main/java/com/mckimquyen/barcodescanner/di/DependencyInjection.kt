package com.mckimquyen.barcodescanner.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mckimquyen.barcodescanner.RApp
import com.mckimquyen.barcodescanner.usecase.*

val RApp.settings
    get() = Settings.getInstance(applicationContext)


val AppCompatActivity.barcodeParser
    get() = ParserBarcode

val AppCompatActivity.barcodeImageScanner
    get() = BarcodeImageScanner

val AppCompatActivity.barcodeImageGenerator
    get() = BarcodeImageGenerator

val AppCompatActivity.barcodeSaver
    get() = SaverBarcode

val AppCompatActivity.barcodeImageSaver
    get() = SaverBarcodeImage

val AppCompatActivity.wifiConnector
    get() = WifiConnector

val AppCompatActivity.otpGenerator
    get() = OTPGenerator

val AppCompatActivity.barcodeDatabase
    get() = BarcodeDatabase.getInstance(this)

val AppCompatActivity.settings
    get() = Settings.getInstance(this)

val AppCompatActivity.contactHelper
    get() = HelperContact

val AppCompatActivity.permissionsHelper
    get() = HelperPermissions

val AppCompatActivity.rotationHelper
    get() = HelperRotation


val Fragment.scannerCameraHelper
    get() = HelperScannerCamera

val Fragment.barcodeParser
    get() = ParserBarcode

val Fragment.barcodeDatabase
    get() = BarcodeDatabase.getInstance(requireContext())

val Fragment.settings
    get() = Settings.getInstance(requireContext())

val Fragment.permissionsHelper
    get() = HelperPermissions
