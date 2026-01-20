//WID(20/12/2025)//Sarthak Mittal(Degamiesign)#1.1.1
package com.example.axremulator2.ModelSelector;
import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.android.aapt.Resources;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.Camera;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;
@Repository
public  interface ModelSelectorRepository extends JpaRepository<ModelSelector,String> {
    @Autowired
    public ModelSelector modelSelector;
    public ModelSelector getModelSelector(ModelSelector modelSelector){return modelSelector;}//Fethcing MdlSelector in App
    public Resources.String saveAllCameraSelector(Camera arcam);
    public Resources.String findAllCameraSelector(Camera arcam);
    public String saveAllByModelMaterial(String ModelMaterial);
    public void findAllByModelMaterial(String ModelMaterial);//Binding ModelMaterial in App
    public String updateByModelMaterial(String ModelMaterial);//Updaating Modelmaterial In App
}