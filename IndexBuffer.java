package com.example.axremulator2.Common.helpers;
import android.opengl.GLES30;

import  java.io.Closeable;
import java.nio.IntBuffer;

import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class IndexBuffer implements Closeable{
    @Id
    @GeneraatedValue(strategy=GENERATIONTYPE)
    public com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer gpuBuffer;
    public IndexBuffer(SampleRenderer sampleRenderer, IntBuffer buffer){
        buffer=new com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer(GLES30.GL_ELEMENT_ARRAY_BUFFER, GpuBuffer.INT_SIZE,entries);

    }
    public int getBufferId(){
        return gpuBuffer.getBufferId();
    }
    public int getSize(){
        return gpuBuffer.getSize();
    }
    public void setFree(){
        gpuBuffer.free();
    }

}
