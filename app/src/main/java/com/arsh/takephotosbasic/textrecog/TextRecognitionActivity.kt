package com.arsh.takephotosbasic.textrecog

import androidx.camera.core.ImageAnalysis
import androidx.core.content.ContextCompat
import com.arsh.takephotosbasic.BaseLensActivity

class TextRecognitionActivity : BaseLensActivity() {
    override val imageAnalyzer = TextAnalyzer()

    override fun startScanner() {
        startTextRecognition()
    }

    private fun startTextRecognition() {
        imageAnalysis.setAnalyzer(
                ContextCompat.getMainExecutor(this),
                imageAnalyzer
        )
    }

}