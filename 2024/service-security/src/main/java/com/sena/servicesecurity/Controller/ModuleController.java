package com.sena.servicesecurity.Controller;

import com.sena.servicesecurity.IService.IModuleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.Entity.Module;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Module, IModuleService>  {

    public ModuleController(IModuleService service){
        super(service, "Module");
    }
}
