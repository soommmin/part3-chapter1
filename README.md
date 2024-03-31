## part3-chapter1

# 얼굴 인식 서비스

얼국 인식 서비스 앱은 카메라를 통해 사용자의 얼굴을 식별합니다. 
앱을 실행하면 카메라가 활성화되고,사용자가 왼쪽 눈을 감으면, 앱은 이를 감지하여 사용자의 실제 얼굴이 카메라에 인식되었음을 확인합니다. 이어서, 오른쪽 눈을 감으면 2단계 인증이 진행됩니다.
마지막으로, 사용자가 웃으면, 앱은 사용자의 얼굴 특징을 더욱 확실하게 인식합니다. 이 세 번의 인증 절차를 모두 통과하면, 사용자는 완료 메시지를 받게 됩니다.



## What I Learned
1. Module
   - 앱은 모듈화된 디자인 아키텍처를 사용하여 각 기능이나 컴포넌트를 독립적으로 개발하고 관리할 수 있습니다.
2. CameraX
   - CameraX는 안드로이드의 카메라 기능을 더욱 간편하게 사용할 수 있도록 도와주는 라이브러리입니다. 이를 통해 카메라의 프리뷰를 표시하고 사진을 촬영할 수 있으며, 얼굴 인식을 위해 카메라로부터 영상 데이터를 획득       합니다.
3. Permission
   - 안드로이드에서 카메라나 기타 민감한 기능을 사용하기 위해서는 사용자의 권한이 필요합니다. 이 앱은 사용자에게 카메라 사용 권한을 요청하여 얼굴 인식 기능을 실행할 수 있도록 합니다.
4. Google Vision
   - Google Vision은 이미지 인식 및 분석을 위한 강력한 도구 중 하나입니다. 얼굴 감지 및 분석을 위해 Google Vision API를 활용하여 카메라에서 촬영한 이미지에서 얼굴을 인식하고 특징을 추출합니다.
5. Paint
   - Paint는 안드로이드에서 그래픽을 그리고 스타일링하기 위해 사용되는 클래스입니다. 이 앱에서는 Paint를 사용하여 카메라 뷰에 얼굴 인식 결과를 그리고 표시합니다.
6. Bezier Curves
   - Bezier Curves는 곡선을 그리기 위한 수학적 기법 중 하나입니다. 얼굴 인식 결과를 표시할 때 Bezier Curves를 활용하여 자연스럽고 부드러운 애니메이션 효과를 추가할 수 있습니다.
7. PathMeasuer
   - PathMeasure는 경로(Path)의 길이를 측정하고 경로를 따라 이동하는 데 사용됩니다. 얼굴 인식 결과를 표시할 때 PathMeasure를 활용하여 경로의 일부를 따라 애니메이션을 적용하거나 특정 부분을 추출할 수 있습      니다.


