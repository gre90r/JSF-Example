package de.gre90r.jsfdemo;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "hello world";
	}
}
