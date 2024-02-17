package com.sena.servicesecurity.Controller;

import com.sena.servicesecurity.Entity.View;
import com.sena.servicesecurity.IService.IViewService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/view")
public class ViewController extends ABaseController<View, IViewService>{
    public ViewController(IViewService service){
        super(service, "View");
    }
}
