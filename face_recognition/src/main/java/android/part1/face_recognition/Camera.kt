package android.part1.face_recognition

import android.content.Context
import android.util.Log
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.google.common.util.concurrent.ListenableFuture
import java.util.concurrent.Executors

class Camera(private val context: Context) {
    private val preview by lazy {
        Preview.Builder()
            .build()
            .also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
    }

    //정면카메라로 세팅하도록
    private val cameraSelector by lazy {
        CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_FRONT)
            .build()
    }

    private lateinit var cameraProviderFuture: ListenableFuture<ProcessCameraProvider>
    private lateinit var previewView: PreviewView

    private var cameraExecutor = Executors.newSingleThreadExecutor()


    //mainActivity에서 받아와서 프리뷰 연결(frameLayout이 파라미터로 들어옴)

    fun initCamera(layout: ViewGroup) {

        previewView = PreviewView(context)
        layout.addView(previewView)

    }

    private fun openPreview() {
        cameraProviderFuture = ProcessCameraProvider.getInstance(context)
            .also { providerFuture ->
                providerFuture.addListener({
                    //실제 프리뷰 스타트
                    startPreview(context)
                }, ContextCompat.getMainExecutor(context))
            }
    }

    private fun startPreview(context: Context) {
        val cameraProvider = cameraProviderFuture.get()
        try {
            cameraProvider.unbindAll()
            cameraProvider.bindToLifecycle(
                context as LifecycleOwner,
                cameraSelector,
                preview,
            )
        } catch (e: Exception) {
            Log.e("Camera", "binding failed", e)
        }
    }

}