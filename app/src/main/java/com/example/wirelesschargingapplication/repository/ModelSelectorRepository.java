package com.example.axremulator2.ModelSelector;

//WID(8/12/2025)//Sarthak Mittal(Degamiesign)
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
    public String findAllCameraSelector(Camera arcam);
    public String saveAllByModelMaterial(String ModelMaterial);
    public void findAllByModelMaterial(String ModelMaterial);//Binding ModelMaterial in App
}