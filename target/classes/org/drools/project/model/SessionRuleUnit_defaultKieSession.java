package org.drools.project.model;

import org.kie.kogito.rules.KieRuntimeBuilder;
import org.kie.kogito.rules.impl.SessionMemory;
import org.drools.modelcompiler.SessionRuleUnitInstance;
import org.kie.kogito.rules.RuleUnit;

@javax.inject.Singleton()
@javax.inject.Named("defaultKieSession")
public class SessionRuleUnit_defaultKieSession implements RuleUnit<SessionMemory> {

    @javax.inject.Inject()
    KieRuntimeBuilder runtimeBuilder;

    @Override
    public SessionRuleUnitInstance createInstance(SessionMemory memory) {
        return new SessionRuleUnitInstance(this, memory, runtimeBuilder.newKieSession("defaultKieSession"));
    }
}
