package com.example.axremulator2.ModelSelector;

import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;

import java.security.Provider;

@Controller
public class ModelSelectorController{//ModelSelectorController clss declare
@Autowired
public ModelSelectorService modelSelectorService;//modelSelectorService Inject Lib
    @GetMapping("/save/{arcam}")
    public String getAllCameraSelector(Camera arcam){//fetching All ArCamera Selecgtor
        return modelSelectorService.saveALlCameraSelector(arcam);
    }
    @PostMapping("/save/{arcam}")
    public String setAllCameraSelector(Camera arcam){//Binding All ArCamera Selecgtor
        return modelSelectorService.setAllCameraSelector(arcam);

    }


}
//        TransformableModel transformableModel=new TransformableModel(arCam.getTransformationSystem());
//        transformableModel.setParent(anchorNode);
//        transformableModel.setRenderable(modelRenderable);
//        transformableModel.select();

