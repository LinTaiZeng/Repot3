package com.ltz;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
class FastdfsApplicationTests {

    @Autowired
    private FastFileStorageClient client;

    @Test
    void contextLoads() throws Exception {
        File file = new File("/Users/lintaizeng/Downloads/1.jpg");
        String filename = file.getName();
        String s = filename.substring(filename.lastIndexOf(".")+1);
        FileInputStream inputStream = new FileInputStream(file);
        StorePath storePath = client.uploadFile(inputStream, file.length(), s, null);

        System.out.println(storePath.getFullPath());
        System.out.println(storePath.getPath());
        System.out.println(storePath.getGroup());
    }

}
