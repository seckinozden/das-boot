package com.boot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository repo;

    @Test
    public void testFindAll() {
        List<Shipwreck> list = repo.findAll();
        assertThat(list.size(), is(greaterThanOrEqualTo(0)));
    }

}
