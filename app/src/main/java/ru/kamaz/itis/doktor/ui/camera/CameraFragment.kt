package ru.kamaz.itis.doktor.ui.camera

import android.annotation.SuppressLint
import android.graphics.Matrix
import android.os.Bundle
import android.view.*
import androidx.camera.core.CameraControl
import androidx.camera.core.CameraX
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.core.impl.ImageCaptureConfig
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.nav_header_main.*
import ru.kamaz.itis.doktor.R

class CameraFragment : Fragment() {

    private lateinit var cameraViewModel: CameraViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cameraViewModel =
            ViewModelProviders.of(this).get(CameraViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        startCamera()
        return root
    }
    @SuppressLint("RestrictedApi")
    private fun startCamera(){
        CameraX.unbindAll()
        val preview= createPreviewUseCase()
        preview.setOnPreviewOutputUpdateListener {
            val parent= textureView.parent as ViewGroup
            parent.removeView(textureView)
            parent.addView(textureView,0)
            textureView.surfaceTexture
            updateTransform()
        }

    }
    private fun createPreviewUseCase(): Preview{
        return Preview.Builder().apply {
            setTargetRotation(textureView.display.rotation)

        }.build()
    }
    private fun createCaptureUseCase() {
        // 2
        val prev= ImageCapture.Builder()
            .apply {

            }



        return
    }

    private fun updateTransform() {
        val matrix = Matrix()

        // 1
        val centerX = textureView.width / 2f
        val centerY = textureView.height / 2f

        // 2
        val rotationDegrees = when (textureView.display.rotation) {
            Surface.ROTATION_0 -> 0
            Surface.ROTATION_90 -> 90
            Surface.ROTATION_180 -> 180
            Surface.ROTATION_270 -> 270
            else -> return
        }
        matrix.postRotate(-rotationDegrees.toFloat(), centerX, centerY)

        // 3
        textureView.setTransform(matrix)
    }

}

private fun Preview.setOnPreviewOutputUpdateListener(function: () -> Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
