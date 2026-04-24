//WID(23/04/2026)(Sarthak Mittal)(Degamiesign)#1.1
package com.example.axremulator2.ModelSelector;

import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.example.wirelesschargingapplication.model.UsbReciever.ModelSelector;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
//import com.example.axremulator2.ModelSelector.XRSession;

import java.util.List;

import static com.example.wirelesschargingapplication.repository.ModelSelectorRepository.modelSelector;

@Repository
public  interface ModelSelectorRepository extends JpaRepository<ModelSelector,String> {
    public List<ModelSelector>saveByCamId(String CamId);
    public List<ModelSelector> findByCamId(String CamId);
    public List<ModelSelector> findByCameraSelector(Camera cam);
    @Autowired
    public ModelSelector modelSelector;

    public String saveAllCameraSelector(Camera arcam);
}
