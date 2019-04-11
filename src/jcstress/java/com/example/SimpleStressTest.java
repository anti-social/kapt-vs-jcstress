package com.example;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.I_Result;

@JCStressTest
@Outcome(id = "1", expect = Expect.ACCEPTABLE, desc = "Ok")
@State
public class SimpleStressTest {
    @Actor
    public void actor(I_Result r) {
        r.r1 = 1;
    }
}
