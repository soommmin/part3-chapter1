package android.part1.face_recognition.recognition

import android.graphics.PointF
import android.graphics.RectF
import android.util.SizeF

interface FaceAnalyzerListener {

    //인식 됐을때
    fun detect()

    fun stopDetect()

    //인식 안됐을때
    fun notDetect()

    //인식 진행상태
    fun detectProgress(progress: Float, message: String)

    //인식된 얼굴의 속성값들의 크기
    fun faceSize(rectF: RectF, sizeF: SizeF, pointF: PointF)
}