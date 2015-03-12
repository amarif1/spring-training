package com.flytxt.training.autowire.car;

import org.springframework.beans.factory.annotation.Autowired;

import com.flytxt.training.autowire.car.externals.seat.Seat;
import com.flytxt.training.autowire.car.externals.wheel.Wheel;
import com.flytxt.training.autowire.car.internals.engine.Engine;
import com.flytxt.training.autowire.car.internals.transmission.Transmission;

public class Car {
	
	private String color;

	@Autowired
	private Engine engine;

	@Autowired
	private Transmission transmission;

	@Autowired
	private Wheel wheel;

	@Autowired
	private Seat seat;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\t");
		stringBuilder.append(color);
		stringBuilder.append("\n\t");
		stringBuilder.append(engine.getClass().getSimpleName());
		stringBuilder.append("\n\t");
		stringBuilder.append(transmission.getClass().getSimpleName());
		stringBuilder.append("\n\t");
		stringBuilder.append(wheel.getClass().getSimpleName());
		stringBuilder.append("\n\t");
		stringBuilder.append(seat.getClass().getSimpleName());
		return stringBuilder.toString();
	}

}
