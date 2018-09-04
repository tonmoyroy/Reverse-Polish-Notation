package com.vizrt.assignment;

import java.util.ArrayList;
import java.util.List;

public class RegistryImpl implements Registry {
    List<Operation> operationList = new ArrayList<Operation>();

    public RegistryImpl(){
        register(new PlusOperationImpl());
        register(new MinusOperationImpl());
        register(new MultiplicationOperationImpl());
        register(new DivisionOperationImpl());
        register(new SUMOperationImpl());
        register(new AVGOperationImpl());
        register(new MINOperationImpl());
        register(new MAXOperationImpl());
        register(new PowerOperationImpl());
    }

    public Operation getOperation(String operator){
        return operationList.stream().filter(op-> op.getOperator().equals(operator)).findFirst().orElse(null);
    }

    private void register(Operation operation){
        operationList.add(operation);
    }
}
