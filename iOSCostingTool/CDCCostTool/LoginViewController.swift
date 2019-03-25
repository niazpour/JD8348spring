//
//  LoginViewController.swift
//  CDCCostTool
//
 

import UIKit

class LoginViewController : UIViewController {
    //Actions
    var rootVC: UIViewController?
    @IBAction func onClick(_ sender: Any) {
        rootVC = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "MainNavigation") as! MainNavigationController
    
    
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appDelegate.window?.rootViewController = rootVC
    
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    
}

