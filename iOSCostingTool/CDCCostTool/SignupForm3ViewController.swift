//
//  SignupForm3ViewController.swift
//  CDCCostTool
//
import UIKit

class SignupForm3ViewController: UIViewController  {
    
    @IBOutlet weak var retroHours: UISwitch!
    @IBOutlet weak var firstDate: UITextField!
    
    var signupData : SignUpData?
    var rootVC : UIViewController?;
    
    //Properties
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        print(signupData?.isLeadContact ?? false);
        print(signupData?.role ?? "");
        print(signupData?.email ?? "");
        print(signupData?.phone ?? "");
    }
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        
    }
    
    @IBAction func onClick(_ sender: Any) {
        signupData?.isRetroHours = retroHours.isOn;
        signupData?.firstDate = firstDate.text ?? "";
        if (retroHours.isOn == true) {
            rootVC = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "retro1") as! RetrospectiveViewController
        } else {
            rootVC = UIStoryboard(name: "Main", bundle: nil).instantiateViewController(withIdentifier: "MainNavigation") as! MainNavigationController 
            
        }
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appDelegate.window?.rootViewController = rootVC
    }
}
