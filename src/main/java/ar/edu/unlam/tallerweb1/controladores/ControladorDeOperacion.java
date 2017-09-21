package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorDeOperacion {
	
	
	@RequestMapping({"/sumar/{primerNumero}/{segundoNumero}"})
	public ModelAndView sumar(@PathVariable String  primerNumero,@PathVariable String  segundoNumero){
		ModelMap modelo = new ModelMap();
		
		modelo.put("num1", primerNumero);
		modelo.put("num2", segundoNumero);

		Integer resultado = Integer.parseInt(primerNumero) + Integer.parseInt(segundoNumero);

		modelo.put("r", resultado);
		
			return new ModelAndView("sumar",modelo);				
		}
	
	@RequestMapping({"/restar/{primerNumero}/{segundoNumero}"})
	public ModelAndView restar(@PathVariable String  primerNumero,@PathVariable String  segundoNumero){
		ModelMap modelo = new ModelMap();
		
		modelo.put("num1", primerNumero);
		modelo.put("num2", segundoNumero);

		Integer resultado = Integer.parseInt(primerNumero)-Integer.parseInt(segundoNumero);

		modelo.put("r", resultado);
		
			return new ModelAndView("restar",modelo);				
		}

	@RequestMapping({"/multiplicar/{primerNumero}/{segundoNumero}"})
	public ModelAndView multiplicar(@PathVariable String  primerNumero,@PathVariable String  segundoNumero){
		ModelMap modelo = new ModelMap();
		
		modelo.put("num1", primerNumero);
		modelo.put("num2", segundoNumero);

		Integer resultado = Integer.parseInt(primerNumero)*Integer.parseInt(segundoNumero);

		modelo.put("r", resultado);
		
			return new ModelAndView("multiplicar",modelo);				
		}
	
	@RequestMapping({"/dividir/{primerNumero}/{segundoNumero}"})
	public ModelAndView dividir(@PathVariable String  primerNumero,@PathVariable String  segundoNumero)  {
		ModelMap modelo = new ModelMap();
		
		modelo.put("num1", primerNumero);
		modelo.put("num2", segundoNumero);

		if(segundoNumero!="0"){
			
			Integer resultado = Integer.parseInt(primerNumero)/Integer.parseInt(segundoNumero);

		modelo.put("r", resultado);
		
			return new ModelAndView("dividir",modelo);	}
					
		else{
			
			return new ModelAndView("mensajeError",modelo);	
		}
		
}
}