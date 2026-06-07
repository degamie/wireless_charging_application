//WID(7/6/2026)(Sarthak Mittal)(DegamieSign)(ModelSelector)
package com.example.axremulator2.ModelSelector;

import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;
@Service
public class ModelSelectorService{
    @Autowired
    public ModelSelectorRepository modelSelectorRepository;
    public String getmodelid(String modelId){return modelSelectorRepository.findBymodelId(modelId);}//Fetching ModeLid in App

    public String getAllCameraSelector(Camera arcam){
        return modelSelectorRepository.saveALlCameraSelector(arcam);
    }
    public String setAllCameraSelector(Camera arcam){
        return findAllCameraSelector(arcam);
    }
}
