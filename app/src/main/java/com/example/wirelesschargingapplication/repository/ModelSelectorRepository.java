//WID(17/03C/2026)//Sarthak Mittal(Degamiesign)#1.1.1.1.1.1.1.1.1.1.1
package com.example.wirelesschargingapplication.repository;
import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.android.aapt.Resources;
import com.example.wirelesschargingapplication.model.UsbReciever.ModelSelector;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.Camera;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;

import java.util.List;

@Repository
public  interface ModelSelectorRepository extends JpaRepository<ModelSelector,String> {
    public List<ModelSelector> findBymodelSelector(ModelSelector modelSelector);
//}
    public List<ModelSelector>updateByModelId(String mdlId);//updating ModelId in Appp
    public ModelSelectorRepository modelselectorrepository;
    public ModelSelectorRepository getModelselectorrepository(ModelSelectorRepository modelselectorrepository);
    public void setModelselectorrepository(ModelSelectorRepository modelselectorrepository);
    public List<ModelSelector> saveByModelId(String mdlId);
    public List<ModelSelector> findByModelID(String mdlId);
    @Autowired
    public ModelSelector modelSelector;
    public void existsByModelSelector(ModelSelector modelSelector );
    public ModelSelector getModelSelector(ModelSelector modelSelector){return modelSelector;}
    public void setModelSelector(ModelSelector modelSelector){this.modelSelector-modelSelector;}
    public List<ModelSelector> updateByModelSelector(ModelSelector modelSelector);
    public void setModelSelector(ModelSelector modelSelector){this.modelSelector=modelSelector;)//Binding ModelSelector in App
    public ModelSelector getModelSelector(ModelSelector modelSelector){return modelSelector;}//Fethcing MdlSelector in App
    public Resources.String saveAllCameraSelector(Camera arcam);
    public Resources.String findAllCameraSelector(Camera arcam);
    public String saveAllByModelMaterial(String ModelMaterial);
    public void findAllByModelMaterial(String ModelMaterial);//Binding ModelMaterial in App
    public String updateByModelMaterial(String ModelMaterial);//Updaating Modelmaterial In App
    public void existsByModelMaterial(String ModelMaterial);//Checking ModelMaterial in App
}