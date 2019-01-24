package com.learning.spring.spring_primary_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.spring_primary_annotation._interface.AutoPilot;
import com.learning.spring.spring_primary_annotation._interface.Direction;

@Service("airborneOperation")
public class AirborneOperation implements AutoPilot{

	private Direction direction;

	public Direction getDirection() {
		return direction;
	}

	@Autowired
	@Override
	public void SetDirection(Direction direction) {
		this.direction = direction;
		
	}

	@Override
	public String getCurrentOperation() {
		return direction.getCurrentOperation();
	}

	public String getAreaName() {
		return direction.getAreaName();
	}
}
