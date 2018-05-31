package org.sonar.plugins.yaml.checks;

import org.sonar.api.rule.RuleKey;

public abstract class YamlCheck {
    protected RuleKey ruleKey = null;
    protected YamlSourceCode yamlSourceCode = null;


    public final void setRuleKey(RuleKey ruleKey) {
        this.ruleKey = ruleKey;
    }

    public RuleKey getRuleKey() {
        return ruleKey;
    }

    /**
     * Sets the source code on which the check is to be performed
     * <p><strong>Call this method before calling {@link #validate()}!</strong></p>
     *
     * @param yamlSourceCode the source code to be checked
     */
    public void setYamlSourceCode(YamlSourceCode yamlSourceCode) {
        this.yamlSourceCode = yamlSourceCode;
    }

    public YamlSourceCode getYamlSourceCode() {
        return yamlSourceCode;
    }

    /**
     * Validates a source code, creating violations for each error found.
     * <p>The default implementation executes the YAMLLint rule whose name corresponds to the check class name
     * (minus the suffix {@literal "Check"}.</p>
     *
     * @throws IllegalStateException if there is no source code to validate, i.e. if {@link #setYamlSourceCode(YamlSourceCode)} has not been called first
     */
    public abstract void validate();
}
