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
class FastdfsDemoApplicationTests {

    @Autowired
    private FastFileStorageClient fileStorageClient;

    @Test
    void contextLoads() throws FileNotFoundException {
        File file = new File("/Users/lintaizeng/Downloads/1.jpg");
        String name = file.getName();
        String s = name.substring(name.lastIndexOf(".") + 1);
        FileInputStream stream = new FileInputStream(file);
        StorePath storePath = fileStorageClient.uploadFile(stream, file.length(), s, null);
        System.out.println(storePath.getGroup());
        System.out.println(storePath.getPath());
        System.out.println(storePath.getFullPath());
    }

}
