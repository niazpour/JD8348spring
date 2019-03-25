//
//  LabViewController.swift
//  CDCCostTool
//
 

import UIKit

class LabViewController: ViewController {
    //Properties
    var rootVC: UIViewController?
    @IBOutlet weak var type3Quantity: UITextField!
    @IBOutlet weak var type2Quantity: UITextField!
    @IBOutlet weak var type1Quantity: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func onClick(_ sender: Any) {
        rootVC = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "MainNavigation") as! MainNavigationController
        
        
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appDelegate.window?.rootViewController = rootVC
    }
}
