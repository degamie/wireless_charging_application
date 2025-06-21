package com.example.axremulator2.ModelSelector;

import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;
@Repository
public  interface ModelSelectorRepository extends JpaRepository<ModelSelector,String> {
    @Autowired
    public ModelSelector modelSelector;

    public String saveAllCameraSelector(Camera arcam);
}