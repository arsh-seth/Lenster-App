package com.arsh.takephotosbasic.barcode

import androidx.core.content.ContextCompat
import com.arsh.takephotosbasic.BaseLensActivity


class BarcodeActivity : BaseLensActivity() {

    override val imageAnalyzer = BarcodeAnalyzer()
    override fun startScanner() {
        scanBarcode()
    }

    private fun scanBarcode() {

        imageAnalysis.setAnalyzer(
                ContextCompat.getMainExecutor(this),
                imageAnalyzer
        )

    }

}