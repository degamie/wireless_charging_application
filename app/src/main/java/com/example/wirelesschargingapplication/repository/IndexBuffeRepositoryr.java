package com.example.axremulator2.Common.helpers;
import static com.example.axremulator2.MainAxr.New_Implement.Repository.GpuBufferRepository.gpuBuffer;

import com.example.axremulator2.Common.helpers.IndexBuffer;

import jdk.javadoc.internal.doclets.toolkit.util.IndexBuilder;
//WID (22/12/2025)

@Repository
public interface IndexBufferRepository extends JpaRepository<IndexBuffer,String> {
    public String saveAllByBufferSize(Integer bufferSize);
    public String findAllByBufferSize(Integer bufferSize);//Finding BufferSize
    public String saveAllByIndexNumber(String BufferNumber);
    public String findAllByIndexNumber(String BufferNumber);//BufferNumber's Finding In IndexBuffe
    public List<IndexBuilder> updateByIndexBuffer(String IndexBuffer);//Updating IndxBuffer in Repo
    public String  updateByIndexNumber(String BufferNumber);//BufferNumber's   Update 's  IndexBuffer

}